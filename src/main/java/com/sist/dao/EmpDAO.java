package com.sist.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.*;

/**
 * @author user
 *	pozo ����� Ŭ����(���, ���� ����)�� ������ ����.
 */
@Repository
public class EmpDAO {
	@Autowired
	private EmpMapper mapper;
	
	public List<EmpVO> empAllData(){
		
		return mapper.empAllData(); //selectList�� ����ִ�.
	}
	
	public EmpVO empFindData(int empno){
		return mapper.empFindData(empno); //selectOne�� ����ִ�.
		
	}
	
	public void empInsert(EmpVO vo) {
		mapper.empInsert(vo);
	}
}
