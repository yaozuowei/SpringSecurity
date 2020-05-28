package com.sans.exception;

public class NullParameterException extends PlatException {
	private static final String CODE = "NullParameterException";
	private static final long serialVersionUID = 2618446269766796165L;

	public NullParameterException() {
		super(CODE);
	}

	public NullParameterException(Throwable throwable) {
		super(CODE, throwable);
	}

	public NullParameterException(String code) {
		super(code);
	}

	public NullParameterException(String code, Throwable throwable) {
		super(code, throwable);
	}
}
