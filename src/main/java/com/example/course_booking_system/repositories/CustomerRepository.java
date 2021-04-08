package com.example.course_booking_system.repositories;

import com.example.course_booking_system.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    List<Customer> findByBookingsCourseName(String name);
    List<Customer> findByLocationAndBookingsCourseName(String location, String courseName);
    List<Customer> findByAgeGreaterThanAndLocationAndBookingsCourseName(int age, String location, String courseName);
}
