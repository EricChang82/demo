package com.demo.globalExceptionCatch;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * 全局异常的捕获类。配合com.demo.controls.exceptionTest 包下类测试。比如ExceptionTest类
 */
@ControllerAdvice(basePackages = "com.demo.controls")  //可指定扫描的包路径
//@ControllerAdvice()  //不知道扫描的包路径，则是全部扫描
public class GlobalExceptionHandler {
    @ExceptionHandler(RuntimeException.class)
    @ResponseBody
    public Map<String, Object> exceptionHandler() {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("errorCode", "101");
        map.put("errorMsg", "系統错误!");
        return map;
    }
}