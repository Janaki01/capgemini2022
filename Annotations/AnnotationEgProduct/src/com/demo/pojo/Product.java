package com.demo.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="productA")
public class Product {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int id;		
	@Column(name="laptop_name")
	private String laptopname; 
	@Column(name="color")
	private String color; 
	@Column(name="weight")
	private String weight; 
	@Column(name="model")
	private String model;
	@Column(name="screensize")
	private String screensize;
	
		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		
		
		public Product() {
		}
		public Product(String laptopname, String color, String weight, String model, String screensize) {
			super();
			this.laptopname = laptopname;
			this.color = color;
			this.weight = weight;
			this.model = model;
			this.screensize = screensize;
		
		}
		
		public String getLaptopname() {
			return laptopname;
		}
		public void setLaptopname(String laptopname) {
			this.laptopname = laptopname;
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		public String getWeight() {
			return weight;
		}
		public void setWeight(String weight) {
			this.weight = weight;
		}
		public String getModel() {
			return model;
		}
		public void setModel(String model) {
			this.model = model;
		}
		public String getScreensize() {
			return screensize;
		}
		public void setScreensize(String screensize) {
			this.screensize = screensize;
		}

		
	
}
