package com.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.pojo.Brand;
import com.demo.pojo.Department;
import com.demo.serviceipl.DepartmentServiceImp;
/**
 * @author Admin
 *
 */
@RestController
@RequestMapping("/depart")
public class DepartmentController {

	//dependency injected her of service class
	@Autowired
	DepartmentServiceImp departmentServiceImp;
    
	/**
	 * @param department
	 * @return
	 */ 
	@PostMapping(value = "/adddepartment")
	public String addDepartmentDetailsBy(@RequestBody Department department) {

		Department d = departmentServiceImp.addDepartmentDetails(department);

		if (d != null) {
			return "insert sucessfully";

		} else {

			return "insert not sucessfully";
		}

	} 
	@PostMapping(value = "/adddepartmentwithproduct")
	public Department saveDepartment(@RequestBody Department department) {
		
		Department d = departmentServiceImp.saveDepartmentdetailstoProduct(department);
		
		return d;
		
	}
}
