package com.rabbitmqdemo.rabbitmqdemo.AOP.exception;



import com.rabbitmqdemo.rabbitmqdemo.VO.reponse.BaseResponse;
import com.rabbitmqdemo.rabbitmqdemo.enums.ResponseEnums;
import com.rabbitmqdemo.rabbitmqdemo.exception.ServiceException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.validation.ConstraintViolationException;


@RestControllerAdvice
public class GlobalExceptionHandler {
    /**
     * 校验请求参数（基本类型）
     */
    @ExceptionHandler(ConstraintViolationException.class)
    public BaseResponse constraintViolationExceptionHandler(ConstraintViolationException ex) {
        return new BaseResponse(ResponseEnums.FAIL.getStatus(), ResponseEnums.FAIL.getMsg(), null);
    }
    
    /**
     * service层异常
     */
    @ExceptionHandler(ServiceException.class)
    public BaseResponse serviceExceptionHandler(ServiceException ex) {
        return new BaseResponse(ResponseEnums.FAIL.getStatus(), ex.getMessage(), null);
    }
    
}
