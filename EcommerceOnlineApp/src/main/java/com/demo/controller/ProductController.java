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

import com.demo.pojo.Product;
import com.demo.pojo.Rating;
import com.demo.serviceipl.ProductServiceImp;
import com.demo.serviceipl.ProductServiceImp;
/**
 * @author Admin
 *
 */
@RestController
@RequestMapping("/prod")
public class ProductController {

	//dependency injected her of service class
	@Autowired
	ProductServiceImp productServiceImp;
    
	/**
	 *  this method retrieved the details of Product by id
	 * @param productid
	 * @return
	 */ 
	@GetMapping(value = "/getproductbyid/{id}")
	public 	Optional<Product> getProductDetailsById(@PathVariable("id") long productid) {
		System.out.println("inside Optional<Product> getProductDetailsById(@PathVariable(\"id\") long productid"+productid);
           // java 8 force me to add Optional<Product> 
		Optional<Product> prodresult = productServiceImp.getDetailsById(productid);
		
		
		

		return prodresult;

	}

	/**
	 * @param product
	 * @return
	 */
	@PostMapping(value = "/addproduct")
	public String addProductDetailsBy(@RequestBody Product product) {

		Product p = productServiceImp.addProductDetails(product);

		if (p != null) {
			return "insert sucessfully";

		} else {

			return "insert not sucessfully";
		}

	}
	
	@GetMapping(value = "/getprodbydate/{date}")
	public List<Product> getListOfProductsByDate(@PathVariable("date") String prodDate){
		List<Product> list = productServiceImp.getListOfProductsByDate(prodDate);
		return list;
	}
	
	@GetMapping(value = "/getprodbyname/{name}")
	public List<Product> getListOfProductsByName(@PathVariable("name") String prodname){
		List<Product> list = productServiceImp.getListOfProductsByName(prodname);
		return list;
	}
	

	@PostMapping(value = "/addproductAndratinForAdmin")
	public String addproductAndratinInfoForAdmin(@RequestBody Product product,@RequestBody Rating rating) {
		  
	Product p=	productServiceImp.productRatingMapping(product,rating);
		

		if (p != null) {
			return "inserted successfully";
		} else {
			return "not inserted";
		}
	}
	
}

