package com.demo.repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.pojo.Department;


	public interface Departmentrepositary extends JpaRepository<Department,Long>{

		Department save(Department department);
	}