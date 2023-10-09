package com.interland.stocks.exception.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.interland.stocks.exception.RecordNotFoundException;

@ControllerAdvice
public class CustomExceptionHandler extends ResponseEntityExceptionHandler {

	@Autowired
	MessageSource messageSource;

	@Override
	protected ResponseEntity<Object> handleHttpMediaTypeNotSupported(HttpMediaTypeNotSupportedException ex,
			org.springframework.http.HttpHeaders headers, HttpStatus status, WebRequest request) {
		System.out.println("the exception is : " +ex);
		return new ResponseEntity<Object>("Please check the Http Media Type/Request Type", HttpStatus.BAD_REQUEST);
	}


	@ExceptionHandler(Exception.class)
	public ResponseEntity<String> handlesAllException(Exception exception) {
		System.out.println(exception.getMessage());
		return new ResponseEntity<String>(
				messageSource.getMessage("common.exception.message", null, LocaleContextHolder.getLocale()),
				HttpStatus.OK);
	}

	@ExceptionHandler(RecordNotFoundException.class)
	public ResponseEntity<String> handleRecordNotFoundException(RecordNotFoundException recordNotFoundException) {
		return new ResponseEntity<String>(recordNotFoundException.getMessage(), HttpStatus.OK);
	}

}
