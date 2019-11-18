package com_PerScholas_Exercise4;

public class InsufficientQuantityException extends Exception {
	private static final long serialVersionUID = 1L;
	
	public InsufficientQuantityException() {};
	public InsufficientQuantityException(String message) {
		super(message);
	}
}
