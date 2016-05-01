package com.fabiohideki.socialbooks.services.exceptions;

public class AutorExistenteException extends RuntimeException {

	private static final long serialVersionUID = 396238736661389233L;

	public AutorExistenteException(String message, Throwable cause) {
		super(message, cause);
	}

	public AutorExistenteException(String message) {
		super(message);
	}
}
