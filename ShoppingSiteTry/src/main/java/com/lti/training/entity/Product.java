package com.lti.training.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.lti.training.entity.enums.Category;
@Entity
@Table(name="SS_product")
public class Product {
	@Id
	@GeneratedValue
	private int Product_id;
	private  String Name;
	private int Quantity;
	private String Description;
	private  String ImagePath;
	private  double Price;
	
	@ManyToOne
	@JoinColumn(name="Retailer_id")
	private Retailer retailer;
	private Category category;
	public Product() {
		super();
	}
	public Product(int product_id, String name, int quantity, String description, String imagePath, double price,
			Retailer retailer, Category category) {
		super();
		Product_id = product_id;
		Name = name;
		Quantity = quantity;
		Description = description;
		ImagePath = imagePath;
		Price = price;
		this.retailer = retailer;
		this.category = category;
	}
	public int getProduct_id() {
		return Product_id;
	}
	public void setProduct_id(int product_id) {
		Product_id = product_id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getQuantity() {
		return Quantity;
	}
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getImagePath() {
		return ImagePath;
	}
	public void setImagePath(String imagePath) {
		ImagePath = imagePath;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		Price = price;
	}
	public Retailer getRetailer() {
		return retailer;
	}
	public void setRetailer(Retailer retailer) {
		this.retailer = retailer;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}

}
