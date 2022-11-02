package com.felipesousa.productcatalog.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.felipesousa.productcatalog.repositories.AddressRepository;

@Service
public class AddressService {

	@Autowired
	private AddressRepository repository;
	
	
}
