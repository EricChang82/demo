package com.demo.controls.basic;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  //该注解只能加到类上
public class ControlHelloWorld {
    @GetMapping("/hello")  //http://localhost:8080/hello?name=CL
    public String hello(String name) {
        return String.format("Hello %s!", name);
    }
}
