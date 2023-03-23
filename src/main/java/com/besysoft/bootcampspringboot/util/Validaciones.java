package com.besysoft.bootcampspringboot.util;

import com.besysoft.bootcampspringboot.exception.InvalidValueException;

import java.util.Optional;

public class Validaciones {

    public static void validarId(Long id){

        if (id == null) throw new InvalidValueException("El ID no puede ser menor a 1");

        if(id < 1) throw new InvalidValueException("El ID no puede ser menor a 1");
    }
}
