package com.felipesousa.productcatalog.services;

import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.felipesousa.productcatalog.dto.ProductDTO;
import com.felipesousa.productcatalog.entities.Product;
import com.felipesousa.productcatalog.repositories.ProductRepository;
import com.felipesousa.productcatalog.services.exceptions.ResourceNotFoundExcepition;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;

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

	public void addStock(Long id, Integer qtd) {
		
		Optional<Product> entity = repository.findById(id);
		if (entity.isPresent()) {
			Integer qtdAtt = entity.get().getQtdInStok();
			entity.get().setQtdInStok(qtdAtt += qtd);

		}

	}

	private void converterDtoInEntity(ProductDTO prodDto, Product prodEntity) {

		prodEntity.setName(prodDto.getName());
		prodEntity.setBarcode(prodDto.getBarcode());
		prodEntity.setQtdInStok(prodDto.getQtdInStok());
		prodEntity.setPrice(prodDto.getPrice());
		prodEntity.setDateValidity(prodDto.getDateValidity());
		
		
		
	}
}
