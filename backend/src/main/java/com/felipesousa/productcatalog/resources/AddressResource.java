package com.felipesousa.productcatalog.resources;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

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

	@GetMapping(value = "/{cep}")
	public ResponseEntity<AddressDTO> findById(@PathVariable String cep) {
		AddressDTO addDto = service.findByCep(cep);
		return ResponseEntity.ok().body(addDto);
	}

	@PostMapping
	public ResponseEntity<AddressDTO> insertAddress(@RequestBody AddressDTO addDto) {
		addDto = service.insertNewAddress(addDto);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("{id}").buildAndExpand(addDto.getId()).toUri();
		return ResponseEntity.created(uri).body(addDto);
	}

}
