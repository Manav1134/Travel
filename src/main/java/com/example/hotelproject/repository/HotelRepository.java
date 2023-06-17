package com.example.hotelproject.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.hotelproject.entity.Hotel;


@Repository
public interface HotelRepository extends JpaRepository<Hotel, Integer> {

}
