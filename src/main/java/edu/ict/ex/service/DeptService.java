package edu.ict.ex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.ict.ex.repository.DeptDao;
import edu.ict.ex.vo.DeptVO;

@Service
public class DeptService{
	@Autowired
	private DeptDao dao;
	
	public List<DeptVO>getList(){
		System.out.println("getList()..");
		return dao.deptSelect();
		
	}
	
}
