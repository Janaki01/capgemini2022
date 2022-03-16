package com.demo.serviceipl;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import com.demo.pojo.Brand;
import com.demo.repositary.Brandrepositary;
import com.demo.service.BrandService;

@Component
public class BrandServiceImp implements BrandService {

	@Autowired
	Brandrepositary brandRespositary; // reference of data layer or bussiness logic class

	/**
	 * add logic here
	 */
	@Override
	public Brand addBrandDetails(Brand brand) {
		// TODO Auto-generated method stub
		return brandRespositary.save(brand);
	}
}