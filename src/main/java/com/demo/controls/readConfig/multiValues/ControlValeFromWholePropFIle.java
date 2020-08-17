package com.demo.controls.readConfig.multiValues;

import com.demo.controls.readConfig.readUdfProp.Person2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 读取指定配置项到单个配置对象类中
 * 测试方式：启动DemoApplication，访问//http://localhost:8080/person
 */
@RestController
public class ControlValeFromWholePropFIle {
    @Autowired
    private Person  person;
    @Autowired
    private Person2 person2;

    @GetMapping("/person")
    public String person() { //http://localhost:8080/person
        String ret=person.toString();
        ret =ret+";"+person2.toString();
        return ret;
    }

}
