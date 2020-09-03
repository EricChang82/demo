package com.demo.mongodb.mongoTemplate;

/**
 * mongo测试,mongoTemplate方式
 */

import com.demo.models.AUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControlMongoTemplate {
    @Autowired
    public UserRepositoryImpl userRepositoryImpl;

    @RequestMapping("/saveUser")  //http://localhost:8080/saveUser
    public String saveUser(String name ,int age) {
        AUser user = new AUser();
        user.setName(name);
        user.setAge(age);
        userRepositoryImpl.saveUser(user,"userInfo");
        return "保存成功";
    }
    @RequestMapping("/findUser")  //http://localhost:8080/findUser?userName=张三
    public String findUser(String userName) {
        String collectionName="userInfo";
        AUser user= userRepositoryImpl.findUserByUserName(userName,collectionName);
        if (user !=null){
            return "查询结果："+user.toString();
        }else{
            return "无记录";
        }
    }
}
