package com.besysoft.bootcampspringboot.exception;

public class OrdenTrabajoException extends BadRequestException{
    public OrdenTrabajoException(Throwable e) {
        super(e);
    }

    public OrdenTrabajoException(String message) {
        super(message);
    }

    public OrdenTrabajoException(String message, Throwable cause) {
        super(message, cause);
    }
}
