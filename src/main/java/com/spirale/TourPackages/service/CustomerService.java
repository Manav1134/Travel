package com.spirale.TourPackages.service;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.spirale.TourPackages.dto.LoginDto;
import com.spirale.TourPackages.entity.Booking;
import com.spirale.TourPackages.entity.Customer;
import com.spirale.TourPackages.repository.CustomerRespository;
import com.spirale.TourPackages.response.ResponseObject;
import com.spirale.TourPackages.util.UserDetailsImpl;

import io.jsonwebtoken.lang.Collections;

@Service
public class CustomerService implements UserDetailsService {

	@Autowired
	CustomerRespository customerRespository;

	
	///This is service helps to create a user
	public ResponseObject create(Customer cus) {
		cus.setCreatedAt(Instant.now());
	    
		BCryptPasswordEncoder bcrypt = new BCryptPasswordEncoder();
		String encryptedpwd = bcrypt.encode(cus.getPassword());
		cus.setPassword(encryptedpwd);
		cus.setConfirmPassword(encryptedpwd);
		customerRespository.save(cus);
		return new ResponseObject("SignUp successful", cus, "200");

	}
	
	
    //This service helps to get All users from data base
	public java.util.List<Customer> getAll() {
		return customerRespository.findAll();
	}

	//This service helps to get one particular customer from data base
	public Optional<Customer> getOne(Integer customerId) {
		return customerRespository.findById(customerId);

	}
	
	
    // This service helps to delete the User
	public ResponseObject deleteCustomer(Integer customerId) {
		Optional<Customer> cus = customerRespository.findById(customerId);
		if (cus.isPresent()) {
			customerRespository.deleteById(customerId);
			return new ResponseObject("Data deleted successfully", cus, "200");
		} else {
			return new ResponseObject("Data not found", cus, "404");
		}
	}

	//This API is for to update the user
	public ResponseObject updateCustomer(Customer cus) {
		Optional<Customer> customerDetails = customerRespository.findById(cus.getCustomerId());
		
		Customer customer= customerDetails.get();
		
		if (customerDetails.isPresent() && cus.equals(customer)) 
		{
			return new ResponseObject("Data already present", customerDetails, "ok");
		} 
		else {
			cus.setUpdateAt(Instant.now());

			Customer save = customerRespository.save(cus);
			return new ResponseObject("Data updated", save, "200");
		}
	}
	
	
	
     //this service tell whether customer exsits or not
	public boolean existsByEmail(String email) {
		return customerRespository.existsByEmail(email);
	}

	
	///this service Check the login username and password is correct or not
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		Optional<Customer> customer = customerRespository.findByEmail(username);
		if (customer.isPresent()) {
			Customer cus = customer.get();
			
			UserDetails userDetails = new UserDetailsImpl(cus.getEmail(), cus.getPassword(), new ArrayList<>());
			return userDetails;
		}else {
			
		throw new UsernameNotFoundException("User not found with username: " + username);
	}
	}
	

}
