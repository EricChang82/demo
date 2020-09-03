package com.demo.controls.passPara;

import com.demo.models.AUser;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * post方式获取传递参数值
 * */
@RestController
public class RestControlPassParaPost {
    /**
     * @RequestParam 获取表单数据传参
     * 若表单变量名与方法变量名相同，则可以省略括号中内容，示例:age. 大小写要保持一致
     * 可以增加将RequestParam 可以增加配置required 参数，若=false则表单传递中可以无对应变量，true的话，必须有对应变量，否则程序报错.例如:city 字段，required=true的话会报错
     */
    @PostMapping("/getWebParaByParam")   //http://localhost:8080/paraTest
    public String getWebParaByParam(@RequestParam(value = "name", required = false) String para1, @RequestParam String age, @RequestParam(value = "city", required = false) String para3) {
        StringBuffer retBuffer = new StringBuffer();
        retBuffer.append("后端获取数据ByParam（RequestParam").append("<br>");
        retBuffer.append("ByParam--> name:" + para1).append("<br>");
        retBuffer.append("ByParam--> age:" + age).append("<br>");
        return retBuffer.toString();
    }
    /**
     * 前端表单封装为对象 @ModelAttribute  可以省略
     */
    @PostMapping("/getWebParaByObj")   //http://localhost:8080/paraTest
    public String getWebParaByObj(@ModelAttribute AUser user) {
        StringBuffer retBuffer = new StringBuffer();
        retBuffer.append("后端获取数据byObject（@ModelAttribute AUser user）").append("<br>");
        retBuffer.append("ByObject-->name:" + user.getName()).append("<br>");
        retBuffer.append("ByObject-->age:" + user.getAge()).append("<br>");
        return retBuffer.toString();
    }

    /**
     * 前端传递的参数名和方法参数名保持一致，直接获取
     */
    @PostMapping("/getWebParaByDirect")   //http://localhost:8080/paraTest
    public String getWebParaByDirect(String name ,String age,Map<String,Object> dataMap) {
        StringBuffer retBuffer = new StringBuffer();
        retBuffer.append("后端获取数据Direct（前端传递的参数名和方法参数名保持一致，直接获取）").append("<br>");
        retBuffer.append("ByMap-->name:");
        dataMap.put("nanme",name);
        dataMap.put("age",age);
        return retBuffer.toString();
    }
    /**
     * 方法内置对象,通过request.getParameter方式获取
     */
    @PostMapping("/getWebParaByRequest")   //http://localhost:8080/paraTest
    public String getWebParaByRequest(HttpServletRequest request, HttpServletResponse response, HttpSession session, Model model) {
        StringBuffer retBuffer = new StringBuffer();
        retBuffer.append("后端获取数据byRequest（方法内置对象,通过request.getParameter方式获取）").append("<br>");
        retBuffer.append("request中的地址信息:" + request.getLocalAddr()).append("<br>");
        retBuffer.append("session:" + session.getCreationTime()).append("<br>");
        retBuffer.append("model:" + model.toString()).append("<br>");
        retBuffer.append("name:" + request.getParameter("name")).append("<br>");
        retBuffer.append("age:" + request.getParameter("age")).append("<br>");
        return retBuffer.toString();
    }

    /**
     * 获取requestHeader中的信息
     */
    @PostMapping("/getRequstHeaderInfo")
    public String getRequstHeaderInfo(@RequestHeader("Accept-Encoding") String encoding,@RequestHeader("Accept") String accept) {
        StringBuffer retBuffer = new StringBuffer();
        retBuffer.append("客户端编码：" + encoding).append("<br>");
        retBuffer.append("accept：" + accept).append("<br>");
        return retBuffer.toString();
    }

}
