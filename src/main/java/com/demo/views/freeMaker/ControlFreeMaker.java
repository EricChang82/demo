package com.demo.views.freeMaker;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * freeMaker测试
 * 启动DemoApplication，http://localhost:8080/freeMaker
 */
@Controller
public class ControlFreeMaker {
    @RequestMapping("/freeMaker")
    public String index(Map<String, Object> map) {
        map.put("message","freeMakerTest测试");
        return "freeMakerTest";
    }
}