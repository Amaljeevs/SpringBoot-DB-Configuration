package com.interland.stocks.exception;

public class RecordCreateException extends Exception {

	/**
	 * Record Create Exception handler.
	 */
	private static final long serialVersionUID = 1L;

	public RecordCreateException() {
		super();
	}

	public RecordCreateException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public RecordCreateException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public RecordCreateException(String message) {
		super(message);
	}

	public RecordCreateException(Throwable cause) {
		super(cause);
	}

}
