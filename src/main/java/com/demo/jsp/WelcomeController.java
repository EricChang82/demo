package com.demo.jsp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;
import java.util.Map;

/**
 * 测试简单的JSP交互
 * 需要配置文件：
 * #spring.mvc.view.prefix: /WEB-INF/jsp/
 * #spring.mvc.view.suffix: .jsp
 * 测试地址：//http://localhost:8080/helloJSP
 */
@Controller
public class WelcomeController {
    @GetMapping("/helloJSP")
    public String welcome(Map<String, Object> model) {
        model.put("time", new Date());
        model.put("message", "hello world-1");
        return "welcome";
    }
}