package com.felipesousa.productcatalog.services.exceptions;


public class ResourceNotFoundExcepition extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public ResourceNotFoundExcepition (String msg) {
		super(msg);
	}

}
