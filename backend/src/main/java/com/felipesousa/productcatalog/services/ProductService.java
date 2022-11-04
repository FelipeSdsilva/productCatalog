package com.felipesousa.productcatalog.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.felipesousa.productcatalog.dto.ProductDTO;
import com.felipesousa.productcatalog.entities.Product;
import com.felipesousa.productcatalog.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;
	
	public Page<ProductDTO> findAll(Pageable pageable){
		Page<Product> pageProduct = repository.findAll(pageable);
		return pageProduct.map((x) -> new ProductDTO(x));
	}
	
	public ProductDTO findById(Long id) {
		Product entity = repository.getReferenceById(id);
		
		
		
		return null;
	}
	

	public void addStock(Long id, Integer qtd) {
		Optional<Product> entity = repository.findById(id);
		if (entity.isPresent()) {
			Integer qtdAtt = entity.get().getQtdInStok();
			entity.get().setQtdInStok(qtdAtt += qtd);
			
		}
		
	}

}
