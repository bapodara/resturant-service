package com.logicalobject.api;

import org.springframework.http.HttpStatus;

import com.logicalobject.exception.ApiException;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-04-10T11:48:41.239-07:00")

public class NotFoundException extends ApiException {
	public NotFoundException(HttpStatus statusCode, String statusMessage) {
		super(statusCode, statusMessage);
		// TODO Auto-generated constructor stub
	}
}
