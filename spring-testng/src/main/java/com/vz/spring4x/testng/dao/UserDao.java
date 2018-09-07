package com.vz.spring4x.testng.dao;

import com.vz.spring4x.testng.domain.User;

/**
 * 用户数据处理接口
 *
 * @author zhangwei
 * @email zhangwei@cetiti.com
 * @date 2018-09-07 12:12:12
 */
public interface UserDao {
    /**
     * 保存用户
     *
     * @param user 用户信息
     */
    void insert(User user);

    /**
     * 根据ID查找用户信息
     *
     * @param id 用户ID
     * @return 用户信息
     */
    User findUserById(Integer id);

    /**
     * 根据信息更新用户信息
     *
     * @param id       用户ID
     * @param username 用户名
     * @param password 密码
     */
    void updateUserById(Integer id, String username, String password);

    /**
     * 根据ID删除用户
     *
     * @param id 用户ID
     */
    void deleteUserById(Integer id);
}
