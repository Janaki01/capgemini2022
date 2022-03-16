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
import javax.persistence.Table;

import org.springframework.stereotype.Component;

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
	
	@ManyToMany(fetch = FetchType.LAZY,cascade = {CascadeType.PERSIST,CascadeType.MERGE})
	@JoinTable(name = "product_ratings", joinColumns = @JoinColumn(name = "product_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "rating_id", referencedColumnName = "id"))
    private Collection<Rating> ratings;
	
	
	public Collection<Rating> getRatings() {
		return ratings;
	}
	public void setRatings(Collection<Rating> ratings) {
		this.ratings = ratings;

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