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

	@Test
	public void canGetAllCoursesByRating(){
		List<Course> found = courseRepository.findByRating(5);
		assertEquals(1, found.size());
	}

	@Test
	public void canGetCustomersForCourse() {
		List<Customer> foundCustomers = customerRepository.findByBookingsCourseName("Intro to Python");
		assertEquals(1, foundCustomers.size());
	}

	@Test
	public void canGetCoursesForCustomer(){
		List<Course> foundCourses = courseRepository.findByBookingsCustomerName("Simon");
		assertEquals(2, foundCourses.size());
	}

	@Test
	public void canGetBookingsByDate() {
		List<Booking> foundBooking = bookingRepository.findByDate("29-02-22");
		assertEquals(2, foundBooking.size());
		assertEquals("Mark", foundBooking.get(0).getCustomer().getName());
	}

}
