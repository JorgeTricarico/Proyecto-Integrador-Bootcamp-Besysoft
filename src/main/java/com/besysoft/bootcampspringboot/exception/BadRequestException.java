package com.besysoft.bootcampspringboot.exception;

public class BadRequestException extends RuntimeException{
    public BadRequestException(Throwable e){
        super(e);
    }
    public BadRequestException(String message) {
        super(message);
    }
    public BadRequestException(String message, Throwable cause) {
        super(message, cause);
    }

}
