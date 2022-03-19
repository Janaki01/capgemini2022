package com.demo.pojo;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Component
@Entity
@Table(name = "rating")
public class Rating {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	long id;
	
    
	@Column
	private String rating;
    @Column
    private String numberofsubscribers;
    
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "ratings")
    @JsonManagedReference
    
private Product product;
	

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

    public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public String getNumberofsubscribers() {
		return numberofsubscribers;
	}
	public void setNumberofsubscribers(String numberofsubscribers) {
		this.numberofsubscribers = numberofsubscribers;
	}
}
