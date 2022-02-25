package ecommerce.com;

public class Product {
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	private int id;
	private String laptopname; 
	private String color; 
	private String weight; 
	private String model;
	private String screensize;
	
	
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