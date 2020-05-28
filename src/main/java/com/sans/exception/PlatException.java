package com.sans.exception;

public class PlatException extends RuntimeException {
	private static final long serialVersionUID = -5294286885609304372L;
	private Object[] args;
	private Object returnObj;

	public PlatException(String msg) {
		super(msg);
	}

	public PlatException(String msg, Object returnObj) {
		super(msg);
		this.returnObj = returnObj;
	}

	public PlatException(String msg, Throwable cause) {
		super(msg, cause);
	}

	public PlatException(String msg, Throwable cause, Object returnObj) {
		super(msg, cause);
		this.returnObj = returnObj;
	}

	public PlatException(String msg, Object[] args) {
		super(msg);
		this.args = args;
	}

	public PlatException(String msg, Object[] args, Object returnObj) {
		super(msg);
		this.args = args;
		this.returnObj = returnObj;
	}

	public PlatException(String msg, Object[] args, Throwable cause) {
		super(msg, cause);
		this.args = args;
	}

	public PlatException(String msg, Object[] args, Throwable cause, Object returnObj) {
		super(msg, cause);
		this.args = args;
		this.returnObj = returnObj;
	}

	public PlatException(Throwable cause) {
		super(cause);
	}

	public PlatException(Throwable cause, Object returnObj) {
		super(cause);
		this.returnObj = returnObj;
	}

	public Object[] getArgs() {
		return this.args;
	}

	public void setArgs(Object[] args) {
		this.args = args;
	}

	public Object getReturnObj() {
		return this.returnObj;
	}
}
