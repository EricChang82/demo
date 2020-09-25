package com.demo.async;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 线程测试，一般的正常流程：单线程
 * //http://localhost:8080/asyncTest
 */
@RestController
public class ControlAsyncTest {
    @Autowired
    private AsyncService asyncService;

    @GetMapping("/asyncTest")
    public String asyncTest() {
        System.out.println("1");
        asyncService.pringMemberInfo();
        System.out.println("4");
        return "异步测试";
    }

}
