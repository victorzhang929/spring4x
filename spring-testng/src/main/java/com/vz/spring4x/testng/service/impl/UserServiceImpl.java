package com.vz.spring4x.testng.service.impl;

import com.vz.spring4x.testng.dao.UserDao;
import com.vz.spring4x.testng.domain.User;
import com.vz.spring4x.testng.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 用户业务接口实现
 * @author zhangwei
 * @email zhangwei@cetiti.com
 * @date 2018-01-03 09:44:00
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public void insertUser(User user) {
        userDao.insert(user);
    }

    @Override
    public User findUserById(Integer id) {
        return userDao.findUserById(id);
    }

    @Override
    public void updateUserById(Integer id, String username, String password) {
        userDao.updateUserById(id, username, password);
    }

    @Override
    public void deleteUserById(Integer id) {
        userDao.deleteUserById(id);
    }
}
