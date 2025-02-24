package com.olizaa.controller.exception;

import com.olizaa.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.ExceptionHandler;

import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.NoSuchElementException;

@RestControllerAdvice
public class GlobalExceptionHandler {

   private final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(IllegalAccessException.class)
    public ResponseEntity<String> handlerBuisnessException(IllegalArgumentException buisnessexception) {
        return new ResponseEntity<>(buisnessexception.getMessage(), HttpStatus.UNPROCESSABLE_ENTITY);
    }

    @ExceptionHandler(NoSuchElementException.class)
    public ResponseEntity<String> handlerNotFoundexceptio(NoSuchElementException notfoundexception) {
        return new ResponseEntity<>("Ressource ID not found. ", HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(Throwable.class)
    public ResponseEntity<String> handlerUnexpectedException(Throwable unexpectedexception) {
        var message = "unexpected server error, see the logs";
        logger.error("", unexpectedexception);
        return new ResponseEntity<>("unexpected server erro, see the logs.", HttpStatus.INTERNAL_SERVER_ERROR);
    }



}
