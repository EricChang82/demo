package com.demo.controls.passPara;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 访问地址传递参数的方式：地址传递、路径参数方式(rest标准方式)
 */
@RestController
public class ControlPassPara {

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

    @PostMapping("/showAccessInfo")   //http://localhost:8080/paraTest
    public String showAccessInfo(HttpServletRequest request, HttpServletResponse response, HttpSession session, Model model) {
        StringBuffer retBuffer =new StringBuffer();
        //@PathVariable获取参数值
        retBuffer.append("country:"+request.getAttribute("countryName")).append("<br>");
        retBuffer.append("country:"+model.getAttribute("countryName")).append("<br>");
        retBuffer.append("city:"+model.getAttribute("city")).append("<br>");
        retBuffer.append("request中的地址信息:"+request.getLocalAddr()).append("<br>");
        retBuffer.append("session:"+session.getCreationTime()).append("<br>");
        retBuffer.append("model:"+model.toString()).append("<br>");
        return retBuffer.toString();
    }

}
