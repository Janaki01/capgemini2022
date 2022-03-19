package com.demo.service;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.demo.pojo.Rating;

@Service
public interface RatingService {
	// POST
	Rating addRatingtDetails(Rating rating);   //done
	Optional<Rating> getDetailsById(long id);    //done
	Rating saveratedetailstoprod(Rating rating);
}