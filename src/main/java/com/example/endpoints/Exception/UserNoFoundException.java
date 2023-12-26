package com.example.endpoints.Exception;

public class UserNoFoundException extends RuntimeException{

	public UserNoFoundException(String message) {
		super(message);
	}
}
