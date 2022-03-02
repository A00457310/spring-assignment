package com.spring.assignment.spring_assignment.controllers;

import com.spring.assignment.spring_assignment.models.Hotel;
import com.spring.assignment.spring_assignment.repositories.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class HotelController {

    @Autowired
    HotelRepository hotelRepository;

    @GetMapping("/hotel")
    public ResponseEntity<List<Hotel>> getAllHotels() {
        try {
            List<Hotel> hotels = hotelRepository.findAll();
            return new ResponseEntity<>(hotels, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/hotel")
    public ResponseEntity<Hotel> createTutorial(@RequestBody Hotel hotel) {
        try {
            Hotel savedHotel = hotelRepository.save(hotel);
            return new ResponseEntity<>(savedHotel, HttpStatus.CREATED);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
