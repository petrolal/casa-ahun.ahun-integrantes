package com.petrolal.ahun.integrantes.exception;

import java.time.Instant;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.petrolal.ahun.integrantes.model.CustomMessageErrorDto;

@ControllerAdvice
public class CustomControllerAdvice {

	@ExceptionHandler({ Exception.class })
	public CustomMessageErrorDto internalServerErrorHandler(Exception ex) {

		long errorTimestamp = Instant.now().toEpochMilli();
		return new CustomMessageErrorDto(false, 
				HttpStatus.INTERNAL_SERVER_ERROR.value(), 
				errorTimestamp, 
				ex.getMessage());
	}

}
