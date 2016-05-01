package com.fabiohideki.socialbooks.services.exceptions;

public class AutorNaoEncontradoException extends RuntimeException {

	private static final long serialVersionUID = 396238736661389233L;

	public AutorNaoEncontradoException(String message, Throwable cause) {
		super(message, cause);
	}

	public AutorNaoEncontradoException(String message) {
		super(message);
	}
}
