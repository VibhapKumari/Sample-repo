package com.pasinpore.flightserviceexample.dto.exception;

public class InsufficientAmountException  extends  RuntimeException{

    public InsufficientAmountException(String message){
        super(message);
    }
}
