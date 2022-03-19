package com.demo.serviceipl;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.demo.pojo.Product;
import com.demo.pojo.Rating;
import com.demo.repositary.Productrepositary;
import com.demo.service.ProductService;

@Component
public class ProductServiceImp implements ProductService {

	@Autowired
	Productrepositary productRespositary; // reference of data layer or bussiness logic class

	/**
	 * add logic here
	 */
	@Override
	public Product addProductDetails(Product prodcut) {
         //add mlgoic        save method 
		return productRespositary.save(prodcut);

	}
	// logic here

	public Optional<Product> getDetailsById(long id) {
		Optional<Product> detailsOfproduct = productRespositary.findById(id);
		return detailsOfproduct;
	}

	 @Override
		public List<Product> getListOfProductsByDate(String date) {
			List<Product> prodList = productRespositary.findByDate(date);
			return prodList;
		}

		@Override
		public List<Product> getListOfProductsByName(String name) {
			List<Product> prodList = productRespositary.findByName(name);
			return prodList;
		}
	
			
		
	}