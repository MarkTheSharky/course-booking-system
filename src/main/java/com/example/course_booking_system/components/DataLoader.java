package com.example.course_booking_system.components;

import com.example.course_booking_system.models.Booking;
import com.example.course_booking_system.models.Course;
import com.example.course_booking_system.models.Customer;
import com.example.course_booking_system.repositories.BookingRepository;
import com.example.course_booking_system.repositories.CourseRepository;
import com.example.course_booking_system.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    CustomerRepository customerRepository;

    public DataLoader() {

    }

    public void run(ApplicationArguments args) {

        Customer simon = new Customer("Simon", "Auchterarder", 32);
        customerRepository.save(simon);

        Customer mark = new Customer("Mark", "Glasgow", 33);
        customerRepository.save(mark);

        Course course1 = new Course("Intro to Python", "Edinburgh", 2);
        courseRepository.save(course1);

        Course course2 = new Course("JavaScriptWorld", "Glasgow", 5);
        courseRepository.save(course2);

        Course course3 = new Course("Java King", "Aberdeen", 4);
        courseRepository.save(course3);

        Booking booking1 = new Booking("09-04-21", course1, simon);
        bookingRepository.save(booking1);

        Booking booking2 = new Booking("14-07-20", course2, mark);
        bookingRepository.save(booking2);

        Booking booking3 = new Booking("29-02-22", course3, mark);
        bookingRepository.save(booking3);

        Booking booking4 = new Booking("29-02-22", course3, simon);
        bookingRepository.save(booking4);

    }
}
