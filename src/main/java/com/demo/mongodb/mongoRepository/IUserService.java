package com.demo.mongodb.mongoRepository;

import com.demo.models.AUser;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * 继承的MongoRepository接口中，
 * 泛型1是对应的domain包中的实体类
 * 泛型2是该类的对应的文档主键
 * 记得贴上Repository注解，该类的对象交由spring容器管理
 */
@Repository
public interface IUserService extends MongoRepository<AUser, Long> {
    public AUser findByUserName(String userName);
}
