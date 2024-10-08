package com.jcosta.dscommerce.services.exceptions;

public class ResourceNotFoundException extends RuntimeException { //runTimeExcepitions não exige try catch no tratamento de exceções

    public ResourceNotFoundException(String msg) {
        super(msg);
    }

}
