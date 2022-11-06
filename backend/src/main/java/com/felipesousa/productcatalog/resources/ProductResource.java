package com.felipesousa.productcatalog.resources;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.felipesousa.productcatalog.dto.ProductDTO;
import com.felipesousa.productcatalog.services.ProductService;

@RestController
@RequestMapping(value = "/products")
public class ProductResource {

	@Autowired
	private ProductService service;

	@GetMapping
	public ResponseEntity<Page<ProductDTO>> findAllPaged(Pageable pageable) {
		Page<ProductDTO> pageProd = service.findAll(pageable);
		return ResponseEntity.ok().body(pageProd);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<ProductDTO> findById(@PathVariable Long id) {
		ProductDTO prodDto = service.findById(id);
		return ResponseEntity.ok().body(prodDto);
	}

	@PostMapping
	public ResponseEntity<ProductDTO> insertNewProduct(@RequestBody ProductDTO prodDto) {
		prodDto = service.insertNewProd(prodDto);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("{id}").buildAndExpand(prodDto.getId()).toUri();
		return ResponseEntity.created(uri).body(prodDto);
		}

	@PutMapping(value = "/{id}")
	public ResponseEntity<ProductDTO> updateProduct(@PathVariable Long id, @RequestBody ProductDTO prodDto){
		prodDto = service.insertNewProd(prodDto);
		return ResponseEntity.ok().body(prodDto);
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> deleteProd(@PathVariable Long id){
		service.deleteProd(id);
		return ResponseEntity.noContent().build();
	}
	
}
