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
import com.demo.serviceipl.RatingServiceImp;

/**
 * @author Admin
 *
 */
@RestController
@RequestMapping("/rate")
public class RatingController {

	//dependency injected her of service class
	@Autowired
	RatingServiceImp ratingServiceImp;
    
	/**
	 *  this method retrieved the details of Rating by id
	 * @param ratingid
	 * @return
	 */ 
	@GetMapping(value = "/getratingbyid/{id}")
	public 	Optional<Rating> getRatingDetailsById(@PathVariable("id") long ratingid) {
		System.out.println("inside Optional<Rating> getRatingDetailsById(@PathVariable(\"id\") long ratingid"+ratingid);
           // java 8 force me to add Optional<Rating> 
		Optional<Rating> rateresult = ratingServiceImp.getDetailsById(ratingid);
		
		
		

		return rateresult;

	}

	/**
	 * @param product
	 * @return
	 */
	@PostMapping(value = "/addrating")
	public String addRatingDetailsBy(@RequestBody Rating rating) {

		Rating r = ratingServiceImp.addRatingtDetails(rating);

		if (r != null) {
			return "insert sucessfully";

		} else {

			return "insert not sucessfully";
		}

	}
	@PostMapping(value = "/addratingwithproduct")
	public Rating saveRating(@RequestBody Rating rate) {
		
		Rating r = ratingServiceImp.saveratedetailstoprod(rate);
		
		return r;
		
	}
	
}

