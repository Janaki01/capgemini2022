package com.demo.service;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.demo.pojo.Brand;

@Service
public interface BrandService {
	// POST
	Brand addBrandDetails(Brand brand);   //done
	
}