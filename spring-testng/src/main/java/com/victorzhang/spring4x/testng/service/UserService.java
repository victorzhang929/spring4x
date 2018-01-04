package com.victorzhang.spring4x.testng.service;

import com.victorzhang.spring4x.testng.domain.User;

public interface UserService {
    void insertUser(User user);

    User findUserById(Integer id);

    void updateUserById(Integer id, String username, String password);

    void deleteUserById(Integer id);
}
