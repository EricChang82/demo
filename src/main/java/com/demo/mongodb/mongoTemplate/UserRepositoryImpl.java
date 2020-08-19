package com.demo.mongodb.mongoTemplate;

import com.demo.models.AUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

@Component
public class UserRepositoryImpl {
    @Autowired
    public MongoTemplate mongoTemplate;

    public void saveUser(AUser user,String collectionName) {
        mongoTemplate.save(user,collectionName);
    }
    public AUser findUserByUserName(String userName,String collectionName) {
        Query query = new Query(Criteria.where("name").is(userName));
        AUser user = mongoTemplate.findOne(query, AUser.class,collectionName);
        return user;
    }
}
