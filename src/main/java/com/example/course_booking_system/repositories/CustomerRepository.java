package com.example.course_booking_system.repositories;

import com.example.course_booking_system.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
