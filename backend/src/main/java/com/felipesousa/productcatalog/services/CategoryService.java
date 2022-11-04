package com.felipesousa.productcatalog.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.felipesousa.productcatalog.dto.CategoryDTO;
import com.felipesousa.productcatalog.entities.Category;
import com.felipesousa.productcatalog.repositories.CategoryRepository;
import com.felipesousa.productcatalog.services.exceptions.ResourceNotFoundExcepition;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository repository;

	@Transactional(readOnly = true)
	public List<CategoryDTO> findAll() {
		List<Category> listCategory = repository.findAll();
		return listCategory.stream().map((x) -> new CategoryDTO(x)).collect(Collectors.toList());
	}

	
	@Transactional(readOnly = true)
	public CategoryDTO findById(Long id) {
		Optional <Category> obj = repository.findById(id);
		Category entity = obj.orElseThrow(() -> new ResourceNotFoundExcepition("Id not foud"));
		return new CategoryDTO(entity);
	}

	@Transactional
	public CategoryDTO insert(CategoryDTO dto) {
		Category entity = new Category();
		entity.setName(dto.getName());
		entity = repository.save(entity);
		return new CategoryDTO(entity);
	}

	@Transactional
	public CategoryDTO update(Long id, CategoryDTO dto) {
		Category entity = repository.getReferenceById(id);
		entity.setName(dto.getName());
		entity = repository.save(entity);
		return new CategoryDTO(entity);
	}

	public void delete(Long id) {
		
		
	}
	
}
