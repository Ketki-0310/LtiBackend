package com.lti.training.entity;

import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.lti.training.entity.enums.Category;

@Entity
@Table(name="SS_retailer")
public class Retailer {
	
	//bjhghg
@Id
@GeneratedValue
	private int Retailer_id;
	private String Name;
	private Category Category;
	private String Email;
	private String Password;
	
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}

	@OneToMany(mappedBy="retailer")
	private Set<Product> product;
	
	
	
	public Retailer(int retailer_id, String name, com.lti.training.entity.enums.Category category, String email,
			String password, Set<Product> product) {
		super();
		Retailer_id = retailer_id;
		Name = name;
		Category = category;
		Email = email;
		Password = password;
		this.product = product;
	}
	public Set<Product> getProduct() {
		return product;
	}
	public void setProduct(Set<Product> product) {
		this.product = product;
	}
	public int getRetailer_id() {
		return Retailer_id;
	}
	public void setCategory(Category category) {
		Category = category;
	}
	public void setRetailer_id(int id) {
		this.Retailer_id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getCategory() {
		return Category.toString();
	}
	
	public Retailer() {
		super();
	}
}
