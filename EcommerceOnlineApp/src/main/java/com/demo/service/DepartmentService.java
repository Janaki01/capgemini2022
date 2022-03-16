package com.demo.service;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.demo.pojo.Department;

@Service
public interface DepartmentService {
	// POST
	Department addDepartmentDetails(Department department);   //done
	
}