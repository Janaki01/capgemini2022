package com.demo.serviceipl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import com.demo.pojo.Rating;
import com.demo.repositary.Ratingrepositary;
import com.demo.service.RatingService;

@Component
public class RatingServiceImp implements RatingService {

	@Autowired
	Ratingrepositary ratingtRespositary; // reference of data layer or bussiness logic class

	/**
	 * add logic here
	 */
	@Override
	public Rating addRatingtDetails(Rating rating) {
         //add mlgoic        save method 
		return ratingtRespositary.save(rating);

	}
	// logic here

	public Optional<Rating> getDetailsById(long id) {
		Optional<Rating> detailsOfrating = ratingtRespositary.findById(id);
		return detailsOfrating;
	}


	}
