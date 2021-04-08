package com.example.course_booking_system;

import com.example.course_booking_system.models.Booking;
import com.example.course_booking_system.models.Course;
import com.example.course_booking_system.models.Customer;
import com.example.course_booking_system.repositories.BookingRepository;
import com.example.course_booking_system.repositories.CourseRepository;
import com.example.course_booking_system.repositories.CustomerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CourseBookingSystemApplicationTests {

	@Autowired
	BookingRepository bookingRepository;

	@Autowired
	CourseRepository courseRepository;

	@Autowired
	CustomerRepository customerRepository;

	@Test
	void contextLoads() {
	}

}
