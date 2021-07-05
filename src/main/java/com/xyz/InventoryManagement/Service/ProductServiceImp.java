package com.xyz.InventoryManagement.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xyz.InventoryManagement.Model.Product;
import com.xyz.InventoryManagement.Repository.ProductRepository;
import com.xyz.InventoryManagement.Service.api.ProductService;

@Service
public class ProductServiceImp implements ProductService{
	
	@Autowired
	private ProductRepository productRepository;
	
	//@Autowired
	//private ImageRepository imageRepository;
	
	public String addProduct(Product product) {
		productRepository.save(product);
		return "New product details saved";
	}
	public List<Product> getProducts() {
		List<Product> products = productRepository.findAll();
		return products;
	}
	
	/*public String saveImage(Image image) {
		imageRepository.save(image);
		return "Image Saved Successfully!";
	} */
}
