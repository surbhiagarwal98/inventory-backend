package com.xyz.InventoryManagement.Service.api;

import java.util.List;

import com.xyz.InventoryManagement.Model.Product;

public interface ProductService {
	
	String addProduct(Product product);
	List<Product> getProducts();
	//String saveImage(Image image);
}
