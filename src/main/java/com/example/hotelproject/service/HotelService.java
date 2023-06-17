package com.example.hotelproject.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hotelproject.entity.Food;
import com.example.hotelproject.entity.Hotel;
import com.example.hotelproject.repository.HotelRepository;
import com.example.hotelproject.response.ResponseObject;
@Service
public class HotelService {
	@Autowired
	private HotelRepository hotelrepository;
	public Hotel createHotel(Hotel hotel) {
		return hotelrepository.save(hotel);
	}
	public Optional<Hotel> getOne(Integer hotelId) {
		return hotelrepository.findById(hotelId);
	
	}
	public ResponseObject deleteHotel(Integer id) {
		Optional<Hotel> hotel = hotelrepository.findById(id);
	      if(hotel.isPresent()) {
	    	  hotelrepository.deleteById(id);
	    	  return new ResponseObject("Data deleted successfully",hotel,"200");
	      }
	      else {
	    	  return new ResponseObject("Data not found",hotel,"404");
	      }
}
	public ResponseObject updatehotel(Hotel hotel ) {
		Optional<Hotel> hoteldetails = hotelrepository.findById(hotel.getHotelId());
	 Hotel hot = hoteldetails.get();
	 if(hoteldetails.isPresent() && hotel.equals(hot))	
		{
			return new ResponseObject("Data already present",hoteldetails,"400");
		}
		else {
			Hotel save = hotelrepository.save(hotel);
			return new ResponseObject("Data updated",save,"200");
		}		
	}
	public List<Hotel> getAllHotel() {
		List<Hotel> listOfHotel= hotelrepository.findAll();
		return listOfHotel;
	}
	
	
	
	}	


