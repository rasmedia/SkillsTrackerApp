package com.perficient.skillstracker.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class NoDataFound extends Exception {

	private static final long serialVersionUID = 1L;
	
	public NoDataFound(String message) {
		super(message);
	}
	
	public NoDataFound(String message, Throwable t) {
		super(message, t);
	}
}
