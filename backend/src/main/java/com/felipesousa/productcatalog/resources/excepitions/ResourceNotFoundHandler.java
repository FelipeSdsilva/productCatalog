package com.felipesousa.productcatalog.resources.excepitions;

import java.time.Instant;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.felipesousa.productcatalog.services.exceptions.DatabaseException;
import com.felipesousa.productcatalog.services.exceptions.ResourceNotFoundExcepition;

@ControllerAdvice
public class ResourceNotFoundHandler {

	@ExceptionHandler(ResourceNotFoundExcepition.class)
	public ResponseEntity<StandardError> entityNotFoud(ResourceNotFoundExcepition e, HttpServletRequest request) {

		StandardError err = new StandardError();
		HttpStatus status = HttpStatus.NOT_FOUND;

		err.setTimeStamp(Instant.now());
		err.setStatus(status.value());
		err.setError("Resource not foud");
		err.setMensage(e.getMessage());
		err.setPath(request.getRequestURI());

		return ResponseEntity.status(status).body(err);
	}
	
	@ExceptionHandler(DatabaseException.class)
	public ResponseEntity<StandardError> integrityDataBase(DatabaseException e, HttpServletRequest request) {

		StandardError err = new StandardError();
		HttpStatus status = HttpStatus.NOT_FOUND;

		err.setTimeStamp(Instant.now());
		err.setStatus(status.value());
		err.setError("Resource not foud");
		err.setMensage(e.getMessage());
		err.setPath(request.getRequestURI());

		return ResponseEntity.status(status).body(err);
	}
}
