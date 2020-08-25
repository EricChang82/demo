package com.demo.controls.controlsForviews.html;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 传递参数测试
 */
@Controller
public class ParaTestEntry {
    @RequestMapping("/paraTest") //http://localhost:8080/paraTest
    public String paraTest(ModelMap map) {
        return "paraTest";
    }
}