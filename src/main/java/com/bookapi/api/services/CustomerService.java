package com.bookapi.api.services;

import com.bookapi.api.entities.Customer;
import com.bookapi.api.repositories.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Customer> findAllCustomers() {
        return customerRepository.findAll();
    }

    public Customer findCustomerById(Long id) {
        return customerRepository.findById(id).orElse(null);
    }

    public Customer addCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    public boolean deleteCustomerById(Long id) {
        if (findCustomerById(id) == null) {
            return false;
        } else {
            customerRepository.deleteById(id);
            return true;
        }
    }
    

    public List<Customer> findCustomersByName(String name) {
        return customerRepository.findByNameIgnoreCase(name);
    }


    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    public Customer updateCustomer(Long id, Customer updatedCustomer) {
        if (customerRepository.existsById(id)) {
            updatedCustomer.setId(id);
            return customerRepository.save(updatedCustomer);
        }
        return null;
    }
}
