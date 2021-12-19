package com.spring.product.service.impl;

import com.spring.product.dao.UserDao;
import com.spring.product.pojo.User;
import com.spring.product.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao = null;

    public User GetUserById(int id) {
        return userDao.GetUserById(id);
    }

    public int InserUser(User user) {
        return userDao.InsertUser(user);
    }
}
