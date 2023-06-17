package com.example.hotelproject.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hotelproject.entity.Food;
import com.example.hotelproject.entity.Hotel;
import com.example.hotelproject.repository.FoodRepository;

import com.example.hotelproject.response.ResponseObject;
@Service
public class FoodService {
	@Autowired
	private FoodRepository foodrepository;
	public Food createFood(Food food) {
		return foodrepository.save(food);
	}
	public Optional<Food> getOne(Integer foodid) {
		return foodrepository.findById(foodid);
	}
	public ResponseObject deleteFood(Integer id) {
		Optional<Food> food = foodrepository.findById(id);
	      if(food.isPresent()) {
	    	  foodrepository.deleteById(id);
	    	  return new ResponseObject("Data deleted successfully",food,"200");
	      }
	      else {
	    	  return new ResponseObject("Data not found",food,"404");
	    	  }
	      }
	      
	      public ResponseObject updatefood(Food food ) {
	  		Optional<Food> fooddetails = foodrepository.findById(food.getFoodid());
	  	 Food food1 = fooddetails.get();
	  	 if(fooddetails.isPresent() && food1.equals(food1))	
	  		{
	  			return new ResponseObject("Data already present",fooddetails,"400");
	  		}
	  		else {
	  			Food save = foodrepository.save(food1);
	  			return new ResponseObject("Data updated",save,"200");
	  		}		
}
	public List<Food> getAll() {
		List<Food> listOfFood= foodrepository.findAll();
		return listOfFood;
	}	

}
