package com.interland.stocks.exception;

public class RecordNotFoundException extends RuntimeException {
	
	/**
	 * handles record not found exception.
	 */

	@Override
	public String toString() {
		return "RecordNotFoundException [errorCode=" + errorCode + ", status=" + status + "]";
	}
	private static final long serialVersionUID = 1L;
	public String errorCode;
	public String status;

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public RecordNotFoundException(String errorCode, String status) {
		super();
		this.errorCode = errorCode;
		this.status = status;
	}

	public RecordNotFoundException() {
		super();
	}

	public RecordNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public RecordNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public RecordNotFoundException(String message) {
		super(message);
	}

	public RecordNotFoundException(Throwable cause) {
		super(cause);
	}



}
