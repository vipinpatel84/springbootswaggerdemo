package com.springboot.swagger.exception;

public class SwaggerApplicationException extends Exception{
    private static final long serialVersionUID = -3042686055658047285L;
    public SwaggerApplicationException(String message) {
        super(message);
    }

    public SwaggerApplicationException(String message, Throwable cause) {
        super(message, cause);
    }

}
