package com.spring.assignment.spring_assignment.repositories;

import com.spring.assignment.spring_assignment.models.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, Long> {
}
