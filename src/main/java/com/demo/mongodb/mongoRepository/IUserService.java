package com.demo.mongodb.mongoRepository;

/**
 * 继承的MongoRepository接口中，
 * 泛型1是对应的domain包中的实体类
 * 泛型2是该类的对应的文档主键
 * 记得贴上Repository注解，该类的对象交由spring容器管理
 */
//@Repository   待完成
//public interface IUserService extends MongoRepository<AUser, Long> {
public interface IUserService {
//    public AUser findByUserName(String userName);
}
