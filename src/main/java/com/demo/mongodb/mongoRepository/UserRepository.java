package com.demo.mongodb.mongoRepository;

import com.demo.models.AUser;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * 继承的MongoRepository接口中，
 * 泛型1是对应的domain包中的实体类
 * 泛型2是该类的对应的文档主键
 * 记得贴上Repository注解，该类的对象交由spring容器管理
 */
@Repository
public class UserRepository implements IUserService {
    @Override
    public AUser findByUserName(String userName) {
        return null;
    }

    @Override
    public <S extends AUser> S save(S s) {
        return null;
    }

    @Override
    public <S extends AUser> List<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<AUser> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public List<AUser> findAll() {
        return null;
    }

    @Override
    public Iterable<AUser> findAllById(Iterable<Long> iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(AUser aUser) {

    }

    @Override
    public void deleteAll(Iterable<? extends AUser> iterable) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<AUser> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<AUser> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public <S extends AUser> S insert(S s) {
        return null;
    }

    @Override
    public <S extends AUser> List<S> insert(Iterable<S> iterable) {
        return null;
    }

    @Override
    public <S extends AUser> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends AUser> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends AUser> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends AUser> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends AUser> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends AUser> boolean exists(Example<S> example) {
        return false;
    }
}
