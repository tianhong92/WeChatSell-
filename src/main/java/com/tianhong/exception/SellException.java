package com.tianhong.exception;

import com.tianhong.enums.ResultEnum;

public class SellException extends RuntimeException{

    private Integer code;
    private String message;

    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();

    }
}
