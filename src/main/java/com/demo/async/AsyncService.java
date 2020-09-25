package com.demo.async;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncService {
    @Async  //开启后该方法为异步执行输出结果:1423,不开启为同步执行 输出结果：1234
    public void pringMemberInfo() {
        System.out.println("2");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("3");
    }
}
