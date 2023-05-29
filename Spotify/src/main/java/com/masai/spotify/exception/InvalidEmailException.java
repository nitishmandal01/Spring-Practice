package com.masai.spotify.exception;

public class InvalidEmailException extends RuntimeException{
	public InvalidEmailException(String msg) {
		super(msg);
	}
}
