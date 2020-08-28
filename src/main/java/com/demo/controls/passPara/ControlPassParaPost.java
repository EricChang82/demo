package com.demo.controls.passPara;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Map;

/**
 * 访问地址传递参数的方式：地址传递、路径参数方式(rest标准方式)
 */
@Controller
public class ControlPassParaPost {

    /**
     * 将值存入map ,返回给到前端。前端通过类似${aaa} 获取。
     */
    @PostMapping("/getInfo")   //http://localhost:8080/paraTest
    public String getInfoByMap(String name ,String age,Map<String,Object> dataMap) {
        dataMap.put("name",name);
        dataMap.put("age",age+"df");
        return "showInfo";
    }
}
