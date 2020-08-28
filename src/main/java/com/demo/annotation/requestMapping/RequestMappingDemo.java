package com.demo.annotation.requestMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController  //该注解只能加到类上
//@RequestMapping("/rm")  //公共前缀. 注意也对GetMapping注解的方法生效
public class RequestMappingDemo {
    // http://localhost:8080/test1
    // http://localhost:8080/rm/test1
    @RequestMapping(value = "/test1", method = RequestMethod.GET)  //相当于getMapping
//    @GetMapping("/test1")
    public String test1(String name) {
        return name;
    }

}
