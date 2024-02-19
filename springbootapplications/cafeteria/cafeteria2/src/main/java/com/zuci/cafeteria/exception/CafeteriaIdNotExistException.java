package com.zuci.cafeteria.exception;

public class CafeteriaIdNotExistException extends RuntimeException{
    String msg;
    public CafeteriaIdNotExistException(String msg){
        super(msg);
        this.msg=msg;
    }
}
