package com.example.demo;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entities.ElectronicProduct;
import com.example.demo.entities.ElectronicProductType;
import com.example.demo.repositories.ElectronicProductRepository;
import com.example.demo.repositories.ElectronicProductTypeRepository;

@SpringBootApplication

public class ElectronicsShoppeeApplication{

	public static void main(String[] args) {
		SpringApplication.run(ElectronicsShoppeeApplication.class, args);
	}
	

}
