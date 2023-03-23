package com.besysoft.bootcampspringboot.exception;

public class InvalidValueException extends BadRequestException{

    public InvalidValueException(Throwable e) {
        super(e);
    }

    public InvalidValueException(String message, Throwable cause) {
        super(message, cause);
    }
    public InvalidValueException(String message) {
        super(message);
    }
}
