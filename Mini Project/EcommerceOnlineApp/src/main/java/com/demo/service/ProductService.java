package com.demo.service;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.demo.pojo.Product;
import com.demo.pojo.Rating;

@Service
public interface ProductService {
	// POST
	Product addProductDetails(Product prodcut);   //done
	Optional<Product> getDetailsById(long id);    //done
	List<Product> getListOfProductsByDate(String date);
	List<Product> getListOfProductsByName(String name);

}