package com.demo.exceptionTest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试异常捕获。此类模拟抛出异常
 * //http://localhost:8080/doSomthing?qty=1   //无异常
 * //http://localhost:8080/doSomthing?qty=0    //抛异常全局捕获
 * //http://localhost:8080/doSomthingWithTryCatch?qty=0     //抛异常内部捕获
 */
@RestController
public class ControlExceptionTest {

    @GetMapping("/doSomthing")
      public String doSomeThing(int qty){
        int value = 1 / qty;
        return "返回值："+value;
      }
    @GetMapping("/doSomthingWithTryCatch")
      public String doSomthingWithTryCatch(int qty){
        int value = 0;
        try {
            value = 1 / qty;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "返回值："+value;
      }
}
