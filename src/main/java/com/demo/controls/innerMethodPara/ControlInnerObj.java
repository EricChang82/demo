package com.demo.controls.innerMethodPara;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 内置对象相关
 */
@RestController
public class ControlInnerObj {
    @RequestMapping("/showAccessInfo")   //http://localhost:8080/showAccessInfo
    public String showAccessInfo(HttpServletRequest request, HttpServletResponse response) {
        return "request中的地址信息:" + request.getLocalAddr();
    }
}
