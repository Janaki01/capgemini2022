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
import com.demo.serviceipl.BrandServiceImp;
/**
 * @author Admin
 *
 */
@RestController
@RequestMapping("/brand")
public class BrandController {

	//dependency injected her of service class
	@Autowired
	BrandServiceImp brandServiceImp;
    
	/**
	 * @param brand
	 * @return
	 */ 
	@PostMapping(value = "/addbrand")
	public String addBrandDetailsBy(@RequestBody Brand brand) {

		Brand b = brandServiceImp.addBrandDetails(brand);

		if (b != null) {
			return "insert sucessfully";

		} else {

			return "insert not sucessfully";
		}

	}
	
	@GetMapping(value = "/getbrandbyid/{id}")
	public 	Optional<Brand> getBrandDetailsById(@PathVariable("id") long brandid) {
		System.out.println("inside Optional<Brand> getBrandDetailsById(@PathVariable(\"id\") long brandid"+brandid);
           // java 8 force me to add Optional<Product> 
		Optional<Brand> brandresult = brandServiceImp.getDetailsById(brandid);
		return brandresult;

	}
	
	@PostMapping(value = "/addbrandwithproduct")
	public Brand saveBrand(@RequestBody Brand brand) {
		
		Brand b = brandServiceImp.saveBranddetailstoProduct(brand);
		
		return b;
		 
	}

}
