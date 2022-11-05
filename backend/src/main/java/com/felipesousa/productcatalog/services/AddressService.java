package com.felipesousa.productcatalog.services;

import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.felipesousa.productcatalog.dto.AddressDTO;
import com.felipesousa.productcatalog.entities.Address;
import com.felipesousa.productcatalog.entities.Provider;
import com.felipesousa.productcatalog.repositories.AddressRepository;
import com.felipesousa.productcatalog.services.exceptions.ResourceNotFoundExcepition;

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
	public AddressDTO findByCep(String cep) {
		try {
			Address entity = repository.findByCep(cep);
			return new AddressDTO(entity);
		} catch (EntityNotFoundException e) {
			throw new ResourceNotFoundExcepition("CEP not found" + cep);
		}
	}

	@Transactional
	public AddressDTO insertNewAddress(AddressDTO addDto) {
	
		Address entity = new Address();
		covertDtoToEntity(entity,addDto);
		entity = repository.save(entity);
		return new AddressDTO(entity);
	}

	private void covertDtoToEntity(Address entity, AddressDTO addDto) {
		
		entity.setStreetName(addDto.getStreetName());
		entity.setDistrict(addDto.getDistrict());
		entity.setCity(addDto.getCity());
		entity.setState(addDto.getState());
		
		Provider provider = new Provider();
		provider.setId(addDto.getId());
		entity.setProvider(provider);
	}

}
