package com.sist.anno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sist.dao.EmpDAO;
import com.sist.dao.EmpVO;

import java.util.*;
/**
 * @author user
 *	여러군데서 쓰면 member로 아니면 지역변수로 받는것이 좋다.
 *
 *	Dao
 *	a() Dao
 *	b() Dao
 *	c() Dao
 */
public class MainClass {

	public static void main(String[] args) {
		ApplicationContext app=new ClassPathXmlApplicationContext("app.xml");
		EmpDAO dao=(EmpDAO) app.getBean("empDAO");//id안주면 default로 클래스명에서 첫번째 문자만 소문자로
		/*List<EmpVO> list=dao.empAllData();
		for (EmpVO vo : list) {
			System.out.println(vo.getEmpno()+" "
					+vo.getEname()+" "
					+vo.getJob()+" "
					+vo.getSal()+" "
					+vo.getHiredate().toString()+" "
					+vo.getSal());
		}*/
		
		/*EmpVO vo=dao.empFindData(7788);
		System.out.println(vo.getEmpno()+" "
				+vo.getEname()+" "
				+vo.getJob()+" "
				+vo.getSal()+" "
				+vo.getHiredate().toString()+" "
				+vo.getSal());*/
		
		EmpVO vo1=new EmpVO();
		vo1.setEname("hong");
		vo1.setJob("manager");
		vo1.setSal(3000);
		dao.empInsert(vo1);
		
		List<EmpVO> list=dao.empAllData();
		for (EmpVO vo : list) {
			System.out.println(vo.getEmpno()+" "
					+vo.getEname()+" "
					+vo.getJob()+" "
					+vo.getSal()+" "
					+vo.getHiredate().toString()+" "
					+vo.getSal()
			);
		}
	}

}
