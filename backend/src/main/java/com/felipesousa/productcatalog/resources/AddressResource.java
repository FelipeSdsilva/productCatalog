package com.felipesousa.productcatalog.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.felipesousa.productcatalog.dto.AddressDTO;
import com.felipesousa.productcatalog.services.AddressService;

@RestController
@RequestMapping(value = "/adresses")
public class AddressResource {

	@Autowired
	private AddressService service;

	@GetMapping
	public ResponseEntity<List<AddressDTO>> findallAddress() {
		List<AddressDTO> listAddress = service.findAll();
		return ResponseEntity.ok().body(listAddress);

	}
	
	/*
	@GetMapping(value = "{id}")
	public ResposeEntity<AddressDTO> findById(@PathVariable Long id){
		AddressDTO entity = service.findByCep(id);
		return ResponseEntity.ok().body(entity);
	}
	*/
	
	
	
}
