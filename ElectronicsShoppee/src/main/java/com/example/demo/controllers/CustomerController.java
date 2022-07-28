package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Customer;
import com.example.demo.services.CustomerService;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;


    @PostMapping("/Customer")
    public String AddCustomer(@RequestBody Customer customer) {
        //return new ResponseEntity<Customer>(customerService.AddCustomer(customer), HttpStatus.CREATED);
        return customerService.AddCustomer(customer);
    }


    @GetMapping("/Customer")
    public String showAllCustomers() {
        return customerService.showAllCustomers();
    }


    @PutMapping("/Customer/{customer_id}")
    public String UpdateCustomerDetails(@RequestBody Customer customer, @PathVariable int customer_id) {
        return customerService.UpdateCustomerDetails(customer, customer_id);
    }


    @DeleteMapping("/Customer/{customer_id}")
    public String DeleteCustomer(@PathVariable int customer_id) {
        return customerService.DeleteCustomer(customer_id);
    }


    @GetMapping("/Customer/{customer_id}")
    public String ShowCustomersOnId(@PathVariable int customer_id) {
        return customerService.ShowCustomersOnId(customer_id);
    }
}

