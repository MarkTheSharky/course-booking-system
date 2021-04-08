package com.example.course_booking_system.controllers;

import com.example.course_booking_system.models.Customer;
import com.example.course_booking_system.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

    /**
     * GET /customers
     * GET /customers?course_name=Java King
     * @return
     */
    @GetMapping(value = "/customers")
    public ResponseEntity getAllCustomersAndFilters(
            @RequestParam(name = "course", required = false) String name
    ) {

        if (name != null) {
            return new ResponseEntity(customerRepository.findByBookingsCourseName(name), HttpStatus.OK);
        }
        return new ResponseEntity(customerRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/customer/{id}")
    public ResponseEntity getCustomer(@PathVariable Long id) {
        return new ResponseEntity(customerRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/customer")
    public ResponseEntity<Customer> postCustomer(@RequestBody Customer customer) {
        customerRepository.save(customer);
        return new ResponseEntity<>(customer, HttpStatus.CREATED);
    }

    @PutMapping(value = "/customer/{id}")
    public ResponseEntity<Customer> putCustomer(@RequestBody Customer customer, @PathVariable Long id) {
        customerRepository.save(customer);
        return  new ResponseEntity<>(customer, HttpStatus.CREATED);
    }

    @DeleteMapping(value = "/customer/{id}")
    public ResponseEntity<List<Customer>> deleteCustomer(@PathVariable Long id) {
        customerRepository.deleteById(id);
        return new ResponseEntity<>(customerRepository.findAll(), HttpStatus.OK);
    }
}
