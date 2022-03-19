package com.demo.service;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.demo.pojo.Brand;
import com.demo.pojo.Product;

@Service
public interface BrandService {
	// POST
	Brand addBrandDetails(Brand brand);   //done
	Optional<Brand> getDetailsById(long id); 
	Brand saveBranddetailstoProduct(Brand brand);
}