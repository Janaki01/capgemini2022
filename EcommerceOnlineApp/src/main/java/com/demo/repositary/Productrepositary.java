package com.demo.repositary;


import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.pojo.Product;


public interface Productrepositary extends JpaRepository<Product,Long>{

	Product save(Product product);

	List<Product> findByDate(String date);
	List<Product> findByName(String name);


}