package com.xyz.InventoryManagement.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ProductDetails")
public class Product {
	
	@Id()
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "productId")
	private int productId;
	@Column(name="productName")
	private String productName;
	@Column(name = "category")
	private String category;
	
	public Product() {
		
	}
	
	public Product(int productId, String productName, String category) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.category = category;
	}
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getCatgory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
}
