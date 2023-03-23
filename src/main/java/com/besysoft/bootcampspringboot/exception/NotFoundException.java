package com.besysoft.bootcampspringboot.exception;

public class NotFoundException extends RuntimeException{

    public NotFoundException(Throwable e){
        super(e);
    }
    public NotFoundException(String message) {
        super(message);
    }
    public NotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
