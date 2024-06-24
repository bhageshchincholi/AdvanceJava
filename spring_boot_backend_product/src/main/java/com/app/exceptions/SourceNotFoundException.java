package com.app.exceptions;

public class SourceNotFoundException extends RuntimeException{
	
	private String message;
	
	public SourceNotFoundException(String message)
	{
		this.message = message;
	}
}
