package com.sist.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.*;

/**
 * @author user
 *	pozo 방식의 클래스(상속, 구현 없는)로 제작해 본다.
 */
@Repository
public class EmpDAO {
	@Autowired
	private EmpMapper mapper;
	
	public List<EmpVO> empAllData(){
		
		return mapper.empAllData(); //selectList가 들어있다.
	}
	
	public EmpVO empFindData(int empno){
		return mapper.empFindData(empno); //selectOne이 들어있다.
		
	}
	
	public void empInsert(EmpVO vo) {
		mapper.empInsert(vo);
	}
}
