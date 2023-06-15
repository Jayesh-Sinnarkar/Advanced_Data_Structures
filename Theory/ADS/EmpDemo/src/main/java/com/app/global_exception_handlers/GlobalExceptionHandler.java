package com.app.global_exception_handlers;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.app.custom_exceptions.ResourceNotFoundException;
import com.app.dtos.ApiResponce;
@RestControllerAdvice
public class GlobalExceptionHandler {

	

		
		@ExceptionHandler(ResourceNotFoundException.class)
		@ResponseStatus(value=HttpStatus.NOT_FOUND)
		public ApiResponce handleResourceNotFoundException(ResourceNotFoundException e)
		{
			return new ApiResponce(e.getMessage());
		}
		
		
		@ExceptionHandler(RuntimeException.class)
		@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
		public ApiResponce handleAnyException(RuntimeException e)
		{
			return new ApiResponce(e.getMessage());
		}
		
	

}
