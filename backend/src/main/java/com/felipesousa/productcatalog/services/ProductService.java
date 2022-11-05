package com.felipesousa.productcatalog.services;

import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.ResourceAccessException;

import com.felipesousa.productcatalog.dto.CategoryDTO;
import com.felipesousa.productcatalog.dto.ProductDTO;
import com.felipesousa.productcatalog.dto.ProviderDTO;
import com.felipesousa.productcatalog.entities.Category;
import com.felipesousa.productcatalog.entities.Product;
import com.felipesousa.productcatalog.entities.Provider;
import com.felipesousa.productcatalog.repositories.CategoryRepository;
import com.felipesousa.productcatalog.repositories.ProductRepository;
import com.felipesousa.productcatalog.repositories.ProviderRepository;
import com.felipesousa.productcatalog.services.exceptions.DatabaseException;
import com.felipesousa.productcatalog.services.exceptions.ResourceNotFoundExcepition;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;

	@Autowired
	private CategoryRepository categoryRepository;
	
	@Autowired
	private ProviderRepository providerRepository;

	@Transactional(readOnly = true)
	public Page<ProductDTO> findAll(Pageable pageable) {
		Page<Product> pageProduct = repository.findAll(pageable);
		return pageProduct.map((x) -> new ProductDTO(x));
	}

	@Transactional(readOnly = true)
	public ProductDTO findById(Long id) {

		Optional<Product> obj = repository.findById(id);
		Product entity = obj.orElseThrow(() -> new ResourceNotFoundExcepition("Entity not Found "));
		return new ProductDTO(entity);
	}

	@Transactional
	public ProductDTO insertNewProd(ProductDTO prodDto) {

		Product entity = new Product();
		converterDtoInEntity(prodDto, entity);
		entity = repository.save(entity);
		return new ProductDTO(entity);

	}

	@Transactional
	public ProductDTO updateProd(Long id, ProductDTO prodDTO) {
		try {
			Product entity = repository.getReferenceById(id);
			converterDtoInEntity(prodDTO, entity);
			entity = repository.save(entity);
			return new ProductDTO(entity);
		} catch (EntityNotFoundException e) {
			throw new ResourceNotFoundExcepition("Id not found " + id);
		}

	}

	public void deleteProd(Long id) {
		try {
			repository.deleteById(id);
		} catch (EmptyResultDataAccessException e) {
			throw new ResourceNotFoundExcepition("Id not found " + id);
		} catch (DataIntegrityViolationException e) {
			throw new DatabaseException("Integrity violation");
		}
	}

	@Transactional
	public void addStock(Long id, Integer qtd) {

		Optional<Product> entity = repository.findById(id);
		if (entity.isPresent()) {
			Integer qtdAtt = entity.get().getQtdInStok();
			entity.get().setQtdInStok(qtdAtt += qtd);

		}

	}

	@Transactional
	public void removStock(Long id, Integer qtd) {

		Optional<Product> entity = repository.findById(id);
		try {
			if (entity.isPresent()) {
				Integer qtdAtt = entity.get().getQtdInStok();
				if (qtdAtt >= qtd) {
					entity.get().setQtdInStok(qtdAtt -= qtd);
				}
			}
		} catch (EntityNotFoundException e) {
			throw new ResourceAccessException("Id not found" + id);
		}

	}

	private void converterDtoInEntity(ProductDTO prodDto, Product prodEntity) {

		prodEntity.setName(prodDto.getName());
		prodEntity.setBarcode(prodDto.getBarcode());
		prodEntity.setQtdInStok(prodDto.getQtdInStok());
		prodEntity.setPrice(prodDto.getPrice());
		prodEntity.setDateValidity(prodDto.getDateValidity());

		prodEntity.getCategories().clear();
		for (CategoryDTO dto : prodDto.getCategories()) {

			Category category = categoryRepository.getReferenceById(dto.getId());
			prodEntity.getCategories().add(category);
		}
		
		prodEntity.getProviders().clear();
		for (ProviderDTO proviDto : prodDto.getProviders()) {
			Provider provider = providerRepository.getReferenceById(proviDto.getId());
			prodEntity.getProviders().add(provider);
		}

	}
}
