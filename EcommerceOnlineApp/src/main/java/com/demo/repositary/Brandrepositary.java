package com.demo.repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.pojo.Brand;


	public interface Brandrepositary extends JpaRepository<Brand,Long>{

		Brand save(Brand brand);
	}