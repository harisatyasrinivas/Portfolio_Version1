package com.satya.career.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.satya.career.entity.Address;

@Repository
public interface AddressDao extends JpaRepository<Address, Long> {	
	

}
