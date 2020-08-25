package com.demo.mongodb.mongoRepository;

/**
 * mongo测试,repository方式
 */

import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControlMongoRepository {
//    @Autowired
//    public UserRepository userRepository;
//
//    @RequestMapping("/RepSaveUser")  //http://localhost:8080/RepSaveUser
//    public String saveUser() {
//        AUser user = new AUser();
//        user.setName("张三");
//        user.setAge(12);
//        userRepository.save(user);
//        return "保存成功";
//    }
//    @RequestMapping("/RepFindUser")  //http://localhost:8080/RepFindUser?userName=张三
//    public String findUser(String userName) {
//        String collectionName="userInfo";
//        AUser user= userRepository.findByUserName(userName);
//        if (user !=null){
//            return "查询结果："+user.toString();
//        }else{
//            return "无记录";
//        }
//    }
}
