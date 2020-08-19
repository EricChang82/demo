package com.demo.controls.passPara;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 访问地址传递参数的方式：地址传递、路径参数方式(rest标准方式)
 *
 */
@RestController
public class ControlPassPara {

    /**
     * 地址方式
     */
    @RequestMapping("/showMessage")   //http://localhost:8080/showMessage?message=天晴了
    public String showMessage(String message){
        return "showMessage--消息为："+message;
    }

    /**
     * 路径参数方式
     */
    @RequestMapping(value="/showMessage/{message}",method = RequestMethod.GET) //http://localhost:8080/showMessage/天晴了
    public String showMessage2(@PathVariable("message") String msg){
        return "showMessage2--消息为："+msg;
    }
    /**
     * 路径参数方式
     */
    @RequestMapping(value="/showMessage/{message}/msg2/{message2}",method = RequestMethod.GET) //http://localhost:8080/showMessage/天晴了/msg2/开始
    public String showMessage3(@PathVariable("message") String msg,@PathVariable("message2") String msg2){
        return "showMessage3--消息1为："+msg+"showMessage3--消息2为："+msg2;
    }

}
