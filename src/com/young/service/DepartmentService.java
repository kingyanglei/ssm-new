package com.young.service;

import com.young.model.Department;
import com.young.mapper.DepartmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {
	
	@Autowired
	private DepartmentMapper departmentMapper;

	public Department getDept(int id) {
		return departmentMapper.selectByPrimaryKey(id);
	}

}
