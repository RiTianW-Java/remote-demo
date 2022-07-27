package com.example.util;

public class ResultUtil {

    private Integer code;

    private String message;


    public boolean isSuccess() {
        return 0 == this.code;
    }
}
