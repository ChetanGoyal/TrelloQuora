package com.upgrad.quora.api.exception;

import com.upgrad.quora.api.model.ErrorResponse;
import com.upgrad.quora.service.exception.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class RestExceptionHandler {

    @ExceptionHandler(SignUpRestrictedException.class)
    public ResponseEntity<ErrorResponse> signUpRestrictedException(SignUpRestrictedException exe, WebRequest request) {
        ErrorResponse errorResponse = new ErrorResponse(exe.getCode(),exe.getErrorMessage(),
                HttpStatus.CONFLICT.toString());
        return new ResponseEntity<ErrorResponse>(errorResponse,HttpStatus.CONFLICT);
    }

    @ExceptionHandler(SignOutRestrictedException.class)
    public ResponseEntity<ErrorResponse> signOutRestrictedException(SignOutRestrictedException exe, WebRequest request) {
        ErrorResponse errorResponse = new ErrorResponse(exe.getCode(),exe.getErrorMessage(),
                HttpStatus.UNAUTHORIZED.toString());
        return new ResponseEntity<ErrorResponse>(errorResponse,HttpStatus.UNAUTHORIZED);
    }


    @ExceptionHandler(AuthenticationFailedException.class)
    public ResponseEntity<ErrorResponse> authenticationFailedException(AuthenticationFailedException exe, WebRequest request) {
        ErrorResponse errorResponse = new ErrorResponse(exe.getCode(),exe.getErrorMessage(),
                HttpStatus.UNAUTHORIZED.toString());
        return new ResponseEntity<ErrorResponse>(errorResponse,HttpStatus.UNAUTHORIZED);
    }

    @ExceptionHandler(AuthorizationFailedException.class)
    public ResponseEntity<ErrorResponse> authorizationFailedException(AuthorizationFailedException exe, WebRequest request) {
        ErrorResponse errorResponse = new ErrorResponse(exe.getCode(),exe.getErrorMessage(),
                HttpStatus.FORBIDDEN.toString());
        return new ResponseEntity<ErrorResponse>(errorResponse,HttpStatus.FORBIDDEN);
    }

    @ExceptionHandler(InvalidQuestionException.class)
    public ResponseEntity<ErrorResponse> invalidQuestionException(InvalidQuestionException exe, WebRequest request) {
        ErrorResponse errorResponse = new ErrorResponse(exe.getCode(),exe.getErrorMessage(),
                HttpStatus.NOT_FOUND.toString());
        return new ResponseEntity<ErrorResponse>(errorResponse,HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(AnswerNotFoundException.class)
    public ResponseEntity<ErrorResponse> answerNotFoundException(AnswerNotFoundException exe, WebRequest request) {
        ErrorResponse errorResponse = new ErrorResponse(exe.getCode(),exe.getErrorMessage(),
                HttpStatus.NOT_FOUND.toString());
        return new ResponseEntity<ErrorResponse>(errorResponse,HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(UserNotFoundException.class)
    public ResponseEntity<ErrorResponse> userNotFoundException(UserNotFoundException exe, WebRequest request) {
        ErrorResponse errorResponse = new ErrorResponse(exe.getCode(),exe.getErrorMessage(),
                HttpStatus.NOT_FOUND.toString());
        return new ResponseEntity<ErrorResponse>(errorResponse,HttpStatus.NOT_FOUND);
    }
}
