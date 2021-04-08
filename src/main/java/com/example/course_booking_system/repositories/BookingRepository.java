package com.example.course_booking_system.repositories;

import com.example.course_booking_system.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}
