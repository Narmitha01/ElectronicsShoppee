package com.example.demo.services;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.ElectronicProduct;
import com.example.demo.entities.ElectronicProductType;
import com.example.demo.repositories.ElectronicProductTypeRepository;

@Service
public class ElectronicProductTypeService{
	@Autowired
	ElectronicProductTypeRepository eptr;

	public List<ElectronicProductType> showAllProductTypes() {
		// TODO 
		return eptr.findAll();
	}

	public String showAllProductTypesOnId(int prdTypeId) {
		// TODO 
		Optional<ElectronicProductType> ept  = eptr. findById(prdTypeId);
		if(ept.isPresent()) {
			return eptr.findById(prdTypeId).toString();
		}
		return "no product type found by id "+prdTypeId;
	}

	public String addProductType(ElectronicProductType electronicProductType) {
		// TODO 
		if(electronicProductType.getName().isEmpty() || String.valueOf(electronicProductType.getPrdType_id()).isEmpty()) {
			return "Add correct input";
		}
		
		ElectronicProductType ept =eptr.save(electronicProductType);
		return "Product type saved "+ept.toString();
	}

	public String updateProductType(ElectronicProductType electronicProductType, int prdTypeId) {
		// TODO 
		Optional<ElectronicProductType> ept  = eptr. findById(prdTypeId);
		if(ept.isPresent()) {
			return "Product type updated"+eptr.save(electronicProductType).toString();
		}
		return "No product type with id "+prdTypeId;
	}

	public String cancelProductType(int prdTypeId) {
		// TODO Auto-generated method stub
		Optional<ElectronicProductType> ept  = eptr. findById(prdTypeId);
		if(ept.isPresent()) {
			eptr.deleteById(prdTypeId);
			return "Product type deleted";
		}
		return "No product type with id "+prdTypeId;
		
	}
	

}
