package com.demo.controls;

import com.demo.log.log4jTest.Log4jTest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试非control功能的入口
 */
@RestController
public class ControlMethodEntry {
    @GetMapping("/testEntry")  //http://localhost:8080/testEntry
    public String testEntry(String name) {

        Log4jTest.doTest();
        return "调用后端方法";
    }
}
