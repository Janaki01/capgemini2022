package com.demo.pojo;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Component
@Entity
@Table(name = "product1")
public class Product {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	long id;
	
    @Column
	private String name;
    @Column
    private String color;
	@Column
	private String height;
		
	//@Column
	//private String productname;
	@Column
	private String date;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "rating_id")
	@JsonBackReference
    private Rating ratings;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "brand_id", referencedColumnName = "id")
    @JsonIgnoreProperties("productList")
	private Brand brands;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "department_id", referencedColumnName = "id")
    @JsonIgnoreProperties("productList")
	private Department departments;
	
	public Brand getBrands() {
		return brands;
	}
	public void setBrands(Brand brands) {
		this.brands = brands;
	}
	
	public Rating getRatings() {
		return ratings;
	}
	public void setRatings(Rating ratings) {
		this.ratings = ratings;
	}
	public Department getDepartments() {
		return departments;
	}
	public void setDepartments(Department department) {
		this.departments = departments;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}

	//public String getProductname() {
	//	return productname;
	//}
	//public void setProductname(String productname) {
	//	this.productname = productname;
	//}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}

}