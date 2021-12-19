package com.spring.product.service;

import com.spring.product.pojo.User;

public interface UserService {
    User GetUserById(int id);

    int InserUser(User user);
}
