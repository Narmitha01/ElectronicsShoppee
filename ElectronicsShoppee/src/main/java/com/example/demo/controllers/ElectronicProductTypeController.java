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

import com.example.demo.entities.ElectronicProductType;
import com.example.demo.services.ElectronicProductTypeService;

@RestController
public class ElectronicProductTypeController {
	
	@Autowired
	ElectronicProductTypeService epts;
	
	@GetMapping("/ElectronicProductType")
	public List<ElectronicProductType> showAllProductTypes() {
		return epts.showAllProductTypes();
	}
	

	@GetMapping("/ElectronicProductType/{prdTypeId}")
	public String showAllProductTypesOnId(@PathVariable int prdTypeId) {
		return epts.showAllProductTypesOnId(prdTypeId);
	}
	

	@PostMapping("/ElectronicProductType")
	public String addProductType(@RequestBody ElectronicProductType electronicProductType ) {
		return epts.addProductType(electronicProductType);
	}
	
	
	@PutMapping("/ElectronicProductType/{prdTypeId}")
	public String updateProductType(@RequestBody ElectronicProductType electronicProductType, @PathVariable int prdTypeId) {
		return epts.updateProductType(electronicProductType,prdTypeId);
	}
	

	@DeleteMapping("/ElectronicProductType/{prdTypeId}")
	public String cancelProductType(@PathVariable int prdTypeId) {
		return epts.cancelProductType(prdTypeId);	
	}
}