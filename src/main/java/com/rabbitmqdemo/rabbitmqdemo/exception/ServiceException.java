package com.rabbitmqdemo.rabbitmqdemo.exception;

public class ServiceException extends RuntimeException{

    public ServiceException(String msg) {
        super(msg);
    }
}
