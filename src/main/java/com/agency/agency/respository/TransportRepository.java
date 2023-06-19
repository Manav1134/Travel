package com.agency.agency.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.agency.agency.entity.Transport;

@Repository
public interface TransportRepository
		extends JpaRepository<Transport, Integer> {

}
