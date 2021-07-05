package com.xyz.InventoryManagement.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.xyz.InventoryManagement.Model.Product;
import com.xyz.InventoryManagement.Service.api.ProductService;

@RestController
@CrossOrigin(origins = "*")
public class InventoryController {
	
	@Autowired
	private ProductService productService;
	
	@RequestMapping(value="/products", method = RequestMethod.POST)
	public String addProduct(@RequestBody Product product) {
		System.out.println("in controller");
		return productService.addProduct(product);
	}
	
	@RequestMapping(value = "/products", method = RequestMethod.GET)
	public List<Product> getProducts() {
		return productService.getProducts();
	}
	
	/*@RequestMapping(value="/images", method = RequestMethod.POST)
	public String saveImage(@RequestBody Image image) {
		return productService.saveImage(image);
	} */
}
