package com.vz.spring4x.testng.service;

import com.vz.spring4x.testng.domain.User;

/**
 * 用户业务接口
 * @author zhangwei
 * @email zhangwei@cetiti.com
 * @date 2018-01-03 09:42:28
 */
public interface UserService {
    /**
     * 保存用户信息
     * @param user 用户信息
     */
    void insertUser(User user);

    /**
     * 根据ID查找用户信息
     * @param id 用户ID
     * @return 用户信息
     */
    User findUserById(Integer id);

    /**
     * 根据信息更新用户
     * @param id 用户ID
     * @param username 用户名
     * @param password 密码
     */
    void updateUserById(Integer id, String username, String password);

    /**
     * 根据ID删除用户信息
     * @param id 用户ID
     */
    void deleteUserById(Integer id);
}
