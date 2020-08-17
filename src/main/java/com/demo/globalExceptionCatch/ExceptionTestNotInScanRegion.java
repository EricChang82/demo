package com.demo.globalExceptionCatch;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试异常捕获。此类不在GlobalExceptionHandler 全局异常捕获类的扫描包范围下，测试不走全局异常
 * //http://localhost:8080/doSomthingNotScanned?qty=1   //无异常
 * //http://localhost:8080/doSomthingNotScanned?qty=0    //抛异常全局捕获
 */
@RestController
public class ExceptionTestNotInScanRegion {

    @GetMapping("/doSomthingNotScanned")
      public String doSomeThing(int qty){
        int value = 1 / qty;
        return "返回值："+value;
      }

}
