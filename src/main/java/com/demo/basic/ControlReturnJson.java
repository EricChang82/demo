package com.demo.basic;

import com.demo.models.AUser;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试返回类型是json.
 * http://localhost:8080/getUser
 */
@RestController
//注解相当于 @ResponseBody ＋ @Controller 合在一起的作用，如果 Web 层的类上使⽤了
// @RestController 注解，就代表这个类中所有的⽅方法都会以 JSON 的形式返回结果，也相当于
// JSON 的一种快捷使用⽅方式
public class ControlReturnJson {
    @RequestMapping(value = "/getUser", method = RequestMethod.GET)
    //@RequestMapping(name="/getUser", method= RequestMethod.POST)，以 /getUser 的⽅方式去请求，
    //method= RequestMethod.POST 是指只可以使⽤用 Post 的⽅方式去请求，如果使⽤用 Get 的⽅方式去请求的话，则会报 405 不不允许访问的错误
    public AUser getUser() {   //http://localhost:8080/getUser  TODO
        AUser user = new AUser();
        user.setName("小明");
        user.setAge(12);
        user.setPass("123456");
        return user;
    }

}
