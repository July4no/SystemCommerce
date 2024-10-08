package com.jcosta.dscommerce.services.exceptions;

public class DatabaseException extends RuntimeException { //runTimeExcepitions não exige try catch no tratamento de exceções

    public DatabaseException(String msg) {

        super(msg);
    }

}
