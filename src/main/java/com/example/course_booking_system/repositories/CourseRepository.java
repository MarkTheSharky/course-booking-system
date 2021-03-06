package com.example.course_booking_system.repositories;

import com.example.course_booking_system.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long> {

    List<Course> findByRating(int rating);
    List<Course> findByBookingsCustomerName(String name);
}
