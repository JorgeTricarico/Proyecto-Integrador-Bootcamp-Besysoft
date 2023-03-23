package com.besysoft.bootcampspringboot.exception;

public class EntityNotFoundException extends NotFoundException{

    public EntityNotFoundException(Throwable e) {
        super(e);
    }

    public EntityNotFoundException(String message) {
        super(message);
    }

    public EntityNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
