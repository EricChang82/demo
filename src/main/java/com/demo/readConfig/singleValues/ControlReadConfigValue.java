package com.demo.readConfig.singleValues;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 读取配置文件项
 * 读取最基本的单个配置项
 * 测试方式：启动DemoApplication项目后访问对应地址 //http://localhost:8080/readConfig/value
 */
@RestController
public class ControlReadConfigValue {

    @Value("${project.udf01}")  //自动读取对应配置项
    private String msg;
    @Value("${project.udf02}")
    private String msg2;

    @GetMapping("/readConfig/value")  //http://localhost:8080/readConfig/value
    public String value() {

        return "读取配置参数: " + msg + "||" + msg2;
    }
}
