package com.victorzhang.spring4x.testng.dao;

import com.victorzhang.spring4x.testng.domain.User;

public interface UserDao {
    void insert(User user);

    User findUserById(Integer id);

    void updateUserById(Integer id, String username, String password);

    void deleteUserById(Integer id);
}
