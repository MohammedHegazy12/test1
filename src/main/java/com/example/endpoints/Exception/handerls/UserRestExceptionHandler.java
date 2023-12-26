package com.example.endpoints.Exception.handerls;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.endpoints.Exception.UserNoFoundException;
import com.example.endpoints.Exception.errors.UserErrorResponse;

@ControllerAdvice
public class UserRestExceptionHandler {

	@ExceptionHandler
	public ResponseEntity<UserErrorResponse>handlerException(UserNoFoundException ex){
		
		UserErrorResponse error=new UserErrorResponse( );
		error.setMessage(ex.getMessage()+"Happy new Year Hegazy you have alo to do");
		error.setStatus(HttpStatus.NOT_FOUND.value());
		error.setTimestamp(System.currentTimeMillis());
		return ResponseEntity.badRequest().body(error);
							 
	}
}
