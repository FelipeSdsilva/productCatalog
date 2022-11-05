package com.felipesousa.productcatalog.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.felipesousa.productcatalog.dto.ProviderDTO;
import com.felipesousa.productcatalog.services.ProviderService;

@RestController
@RequestMapping(value = "/providers")
public class ProviderResource {

	@Autowired
	private ProviderService service;

	@GetMapping
	public ResponseEntity<List<ProviderDTO>> findAll() {
		List<ProviderDTO> provList = service.findAll();
		return ResponseEntity.ok().body(provList);
	}
}
