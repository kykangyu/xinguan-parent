package com.kykangyu.handler;

import com.kykangyu.response.Result;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class ClobalExceptionHandler {
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Result error(Exception e){
        return Result.error();
    }

    @ExceptionHandler(BusinessException.class)
    @ResponseBody
    public Result error(BusinessException e){
        e.printStackTrace();
        return Result.error().cede(e.getCode()).message(e.getErrMsg());
    }

}
