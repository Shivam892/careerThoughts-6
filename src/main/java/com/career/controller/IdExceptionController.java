package com.career.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class IdExceptionController {
	
	@ExceptionHandler(value=IdNotFound.class)
	public ResponseEntity<Object> exception(IdNotFound exception){
		return new ResponseEntity<>("Id Not Found", HttpStatus.NOT_FOUND);
	}
	

}
