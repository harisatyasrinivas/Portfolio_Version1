package com.satya.career.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.satya.career.dao.AddressDao;
import com.satya.career.entity.Address;

@Service
public class AddressServiceImpl implements AddressService {
	
	@Autowired
	private AddressDao addressDao;

	@Override
	public Address getAddress(long id) {
		return addressDao.getOne(id); 
	}

}
