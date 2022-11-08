package com.felipesousa.productcatalog.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.felipesousa.productcatalog.dto.ProviderDTO;
import com.felipesousa.productcatalog.entities.Provider;
import com.felipesousa.productcatalog.repositories.ProviderRepository;
import com.felipesousa.productcatalog.services.exceptions.ResourceNotFoundException;

@Service
public class ProviderService {

	@Autowired
	private ProviderRepository repository;

	@Transactional(readOnly = true)
	public List<ProviderDTO> findAll() {
		List<Provider> listProvider = repository.findAll();
		return listProvider.stream().map((x) -> new ProviderDTO(x)).toList();

	}

	@Transactional(readOnly = true)
	public ProviderDTO findById(Long id) {
		Provider obj = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Entity not found "));
		return new ProviderDTO(obj);
	}

	public ProviderDTO insertNewProvi(ProviderDTO proviDto) {
		Provider entity = new Provider();
		entity.convertEntityToDto(entity, proviDto);
		entity = repository.save(entity);
		return new ProviderDTO(entity);
	}


}
