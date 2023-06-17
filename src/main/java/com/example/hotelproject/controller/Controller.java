package com.example.hotelproject.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.hotelproject.entity.Hotel;
import com.example.hotelproject.response.ResponseObject;
import com.example.hotelproject.service.HotelService;

@RestController
public class Controller {
	@Autowired
	HotelService service;
	@PostMapping("/hotelcreate")
	public Hotel addHotel(@RequestBody Hotel hotel) {
		return service.createHotel(hotel);

	}

	@GetMapping("/getAll")
	public java.util.List<Hotel> getAllHotel() {
		return service.getAllHotel();
	}

	 @PutMapping("/updatehotel/{hotelid}") 
    public ResponseObject
	 updateHotel(@RequestBody Hotel hotel) { 
		  return service.updatehotel(hotel);
	   }
	 
	@GetMapping("/getOne/{id}")
	public Optional<Hotel> getOne(@PathVariable Integer id) {
		return service.getOne(id);
	}

	@DeleteMapping("/deleteHotel/{id}")
	public ResponseObject delete(@PathVariable Integer id) {
		return service.deleteHotel(id);
	}
}
