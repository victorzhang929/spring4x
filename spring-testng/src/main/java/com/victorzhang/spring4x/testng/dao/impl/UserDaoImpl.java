package com.victorzhang.spring4x.testng.dao.impl;

import com.victorzhang.spring4x.testng.dao.UserDao;
import com.victorzhang.spring4x.testng.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author zhangwei
 * @email zhangwei@cetiti.com
 * @create 2018-01-03 09:44:28
 */
@Repository("userDao")
public class UserDaoImpl implements UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void insert(User user) {
        String sql = "insert into t_user (username, password, gmt_create, gmt_modified, status) values(?,?,?,?,?)";
        jdbcTemplate.update(sql, user.getUsername(), user.getPassword(), user.getGmtModified(), user.getGmtModified(), user.getStatus());
    }

    @Override
    public User findUserById(Integer id) {
        String sql = "select username, password from t_user where id = ?";
        final User user = new User();
        jdbcTemplate.query(sql, new Object[]{id}, (resultSet) -> {
            user.setId(id);
            user.setUsername(resultSet.getString("username"));
            user.setPassword(resultSet.getString("password"));
        });
        return user;
    }

    @Override
    public void updateUserById(Integer id, String username, String password) {
        String sql = "update t_user set username = ?, password = ? where id = ?";
        jdbcTemplate.update(sql, username, password, id);
    }

    @Override
    public void deleteUserById(Integer id) {
        String sql = "delete from t_user where id = ? ";
        jdbcTemplate.update(sql, id);
    }
}
