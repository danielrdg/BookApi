package com.bookapi.api.repositories;

import com.bookapi.api.entities.Customer;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    List<Customer> findByNameIgnoreCase(String name);
    
}
