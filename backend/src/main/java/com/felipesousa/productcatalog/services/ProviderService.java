package com.felipesousa.productcatalog.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.felipesousa.productcatalog.dto.ProviderDTO;
import com.felipesousa.productcatalog.entities.Provider;
import com.felipesousa.productcatalog.repositories.ProviderRepository;

@Service
public class ProviderService {
	
	@Autowired
	private ProviderRepository repository;

	public List<ProviderDTO> findAll() {
		List<Provider> listProvider = repository.findAll();
		return listProvider.stream().map((x) ->  new ProviderDTO(x)).collect(Collectors.toList());
		
	}
	
}
