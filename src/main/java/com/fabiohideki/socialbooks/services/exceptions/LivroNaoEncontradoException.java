package com.fabiohideki.socialbooks.services.exceptions;

public class LivroNaoEncontradoException extends RuntimeException {

	private static final long serialVersionUID = 396238736661389233L;

	public LivroNaoEncontradoException(String message, Throwable cause) {
		super(message, cause);
	}

	public LivroNaoEncontradoException(String message) {
		super(message);
	}
}
