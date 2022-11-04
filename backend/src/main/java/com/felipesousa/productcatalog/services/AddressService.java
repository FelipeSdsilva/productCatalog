package com.felipesousa.productcatalog.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.felipesousa.productcatalog.dto.AddressDTO;
import com.felipesousa.productcatalog.entities.Address;
import com.felipesousa.productcatalog.repositories.AddressRepository;

@Service
public class AddressService {

	@Autowired
	private AddressRepository repository;

	@Transactional(readOnly = true)
	public List<AddressDTO> findAll() {
		List<Address> listAddress = repository.findAll();
		return listAddress.stream().map((x) -> new AddressDTO(x)).collect(Collectors.toList());
	}
	
	@Transactional(readOnly = true)
	public AddressDTO findByCep(Long id) {
		Optional<Address> obj = repository.findById(id);
		obj.get().getCep();
		return null;
	}
	
	
	
}
