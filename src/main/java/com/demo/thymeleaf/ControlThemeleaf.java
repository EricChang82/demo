package com.demo.thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * themeleaf测试。
 * 确保pom正常加载
 * 注释掉配置文件中JSP的配置
 * 启动DemoApplication，http://localhost:8080/Themeleaf
 */
@Controller
public class ControlThemeleaf {
    @RequestMapping("/Themeleaf")
    public String index(ModelMap map) {
        map.addAttribute("message", "Themeleaf访问测试");
        return "themeleafTest";
//        return "common";
    }
}