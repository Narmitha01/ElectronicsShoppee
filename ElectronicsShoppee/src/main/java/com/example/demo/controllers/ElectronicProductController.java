package com.example.demo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.ElectronicProduct;
import com.example.demo.services.ElectronicProductService;



@RestController
public class ElectronicProductController {
	@Autowired
	ElectronicProductService eps;

	
	@GetMapping("/ElectronicProduct")
	public List<ElectronicProduct> showAllProducts() {
		return eps.showAllProducts();
	}

	@GetMapping("/ElectronicProduct/{productId}")
	public String showAllProductsOnId(@PathVariable int productId) {
		return eps.showAllProductsOnId(productId) ;
	}
	
    	
	@PostMapping("/ElectronicProduct")
	public String addProduct(@RequestBody ElectronicProduct electronicProduct ) {
		return eps.addProduct(electronicProduct);
	}
	
	
	@PutMapping("/ElectronicProduct/{productId}")
	public String updateProduct(@RequestBody ElectronicProduct electronicProduct, @PathVariable int productId) {
		return eps.updateProduct(electronicProduct,productId);
	}
	

	@DeleteMapping("/ElectronicProduct/{productId}")
	public String cancelProduct(@PathVariable int productId) {
		return eps.cancelProduct(productId);	
	}
}