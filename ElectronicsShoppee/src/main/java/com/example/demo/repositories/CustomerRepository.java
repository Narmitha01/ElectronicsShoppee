package com.example.demo.repositories;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.entities.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {

}
