package com.example.firstapp.controller;

import com.example.firstapp.dao.CustomerDao;
import com.example.firstapp.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {

    private CustomerDao customerDao;

    @Autowired
    public CustomerController(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    @GetMapping("customer")
    public List<Customer> getAllCustomers(){
        return customerDao.getAllCustomers();
    }

    @GetMapping("customerByFirstName")
    public List<Customer> getCustomersByFirstName(@RequestParam String name){
        return customerDao.getAllCustomersByFirstName(name);
    }

    @GetMapping("customer/{id}")
    public Customer getCustomerById(@PathVariable int id) {
        return customerDao.getCustomerById(id);
    }

    // add new customer
    @PostMapping("customer")
    public Customer addNewCustomer(@RequestBody Customer customer) {
        return customerDao.addCustomer(customer);
    }
}
