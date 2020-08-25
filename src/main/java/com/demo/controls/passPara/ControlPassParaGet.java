package com.demo.controls.passPara;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 传参到方法中读取,get方式
 */
@RestController
public class ControlPassParaGet {

    /**
     * 地址方式
     */
    @RequestMapping("/showMessage")   //http://localhost:8080/showMessage?message=111
    public String showMessage(String message) {
        return "showMessage--消息为：" + message;
    }

    /**
     * 路径参数方式
     */
    @RequestMapping(value = "/showMessage/{message}", method = RequestMethod.GET)
    //http://localhost:8080/showMessage/232
    public String showMessage2(@PathVariable("message") String msg) {
        return "showMessage2--消息为：" + msg;
    }

    /**
     * 路径参数方式:中间有字符串地址间隔
     */
    @RequestMapping(value = "/showMessage/{message}/msg2/{message2}", method = RequestMethod.GET)
    //http://localhost:8080/showMessage/111/msg2/2222
    public String showMessage3(@PathVariable("message") String msg, @PathVariable("message2") String msg2) {
        return "showMessage3--消息1为：" + msg + "showMessage3--消息2为：" + msg2;
    }


}
