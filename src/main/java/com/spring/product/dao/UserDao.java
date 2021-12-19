package com.spring.product.dao;

import com.spring.product.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
public interface UserDao {
    User GetUserById(int id);

    int InsertUser(User user);
}
