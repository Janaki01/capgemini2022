package com.demo.serviceipl;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.demo.pojo.Brand;
import com.demo.pojo.Department;
import com.demo.pojo.Product;
import com.demo.repositary.Departmentrepositary;
import com.demo.service.DepartmentService;

@Component
public class DepartmentServiceImp implements DepartmentService {

	@Autowired
	Departmentrepositary departmentRespositary; // reference of data layer or bussiness logic class

	/**
	 * add logic here
	 */
	@Override
	public Department addDepartmentDetails(Department department) {

		return departmentRespositary.save(department);
	}
		

	public Department saveDepartmentdetailstoProduct(Department department) {
		List<Product> product = department.getProductList();
        department.setProductList(product);
        Product p = new Product();
        p.setDepartments(department);
        department = departmentRespositary.save(department);
        return department;
	}

}