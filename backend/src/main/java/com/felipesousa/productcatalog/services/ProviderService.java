package com.felipesousa.productcatalog.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.felipesousa.productcatalog.dto.ProviderDTO;
import com.felipesousa.productcatalog.entities.Provider;
import com.felipesousa.productcatalog.repositories.ProviderRepository;
import com.felipesousa.productcatalog.services.exceptions.ResourceNotFoundExcepition;

@Service
public class ProviderService {
	
	@Autowired
	private ProviderRepository repository;

	@Transactional(readOnly = true)
	public List<ProviderDTO> findAll() {
		List<Provider> listProvider = repository.findAll();
		return listProvider.stream().map((x) ->  new ProviderDTO(x)).collect(Collectors.toList());
		
	}
	
	public ProviderDTO findById(Long id) {
		Optional<Provider> obj = repository.findById(id);
		Provider entity = obj.orElseThrow(() -> new ResourceNotFoundExcepition("Entity not found "));
		return new ProviderDTO(entity);
	}
	
}
