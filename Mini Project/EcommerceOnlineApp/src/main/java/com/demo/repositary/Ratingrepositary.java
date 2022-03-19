package com.demo.repositary;
import org.springframework.data.jpa.repository.JpaRepository;


import com.demo.pojo.Product;
import com.demo.pojo.Rating;


	public interface Ratingrepositary extends JpaRepository<Rating,Long>{

		Rating save(Rating rating);
	}