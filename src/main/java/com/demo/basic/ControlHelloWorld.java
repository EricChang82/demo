package com.demo.basic;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  //该注解只能加到类上
//@RequestMapping("/rm")  //公共前缀. 注意也对GetMapping注解的方法生效
public class ControlHelloWorld {
    @GetMapping("/hello")  //http://localhost:8080/hello?name=CL
//    @RequestMapping(value = "/hello", method = RequestMethod.GET)  //相当于getMapping
    public String hello(String name) {
        return String.format("Hello %s!", name);
    }
}
