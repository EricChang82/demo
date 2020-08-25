package com.demo.controls.passPara;

import com.demo.models.AUser;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 访问地址传递参数的方式：地址传递、路径参数方式(rest标准方式)
 */
@RestController
public class ControlPassParaPost {
    /**
     * @RequestParam 获取表单数据传参
     * 若表单变量名与方法变量名相同，则可以省略括号中内容，示例:age. 大小写要保持一致
     * 可以增加将RequestParam 可以增加配置required 参数，若=false则表单传递中可以无对应变量，true的话，必须有对应变量，否则程序报错.例如:city 字段，required=true的话会报错
     */
//    @PostMapping("/showAccessInfo")   //http://localhost:8080/paraTest
    public String showAccessInfo(@RequestParam(value = "name", required = false) String para1, @RequestParam String age, @RequestParam(value = "city", required = false) String para3) {
        StringBuffer retBuffer = new StringBuffer();
        retBuffer.append("ByParam--> name" + para1).append("<br>");
        retBuffer.append("ByParam--> age:" + age).append("<br>");
        return retBuffer.toString();
    }
    /**
     * 前端表单封装为对象 @ModelAttribute  可以省略
     */
    @PostMapping("/showAccessInfo")   //http://localhost:8080/paraTest
    public String showAccessInfoByObject(@ModelAttribute AUser user) {
        StringBuffer retBuffer = new StringBuffer();
        retBuffer.append("ByObject-->name:" + user.getName()).append("<br>");
        retBuffer.append("ByObject-->age:" + user.getAge()).append("<br>");
        return retBuffer.toString();
    }
    /**
     * 方法内置对象
     */
    @PostMapping("/showInnerpara")   //http://localhost:8080/showInnerpara
    public String showInnerpara(HttpServletRequest request, HttpServletResponse response, HttpSession session, Model model) {
        StringBuffer retBuffer = new StringBuffer();
        retBuffer.append("request中的地址信息:" + request.getLocalAddr()).append("<br>");
        retBuffer.append("session:" + session.getCreationTime()).append("<br>");
        retBuffer.append("model:" + model.toString()).append("<br>");
        return retBuffer.toString();
    }

}
