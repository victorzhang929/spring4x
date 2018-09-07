package com.vz.spring4x.testng.controller;

import com.vz.spring4x.testng.base.AbstractControllerTestNGTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.testng.annotations.Test;

/**
 * 用户控制器测试类
 * @author zhangwei
 * @email zhangwei@cetiti.com
 * @date 2018-01-04 09:27:24
 */
@ContextConfiguration({"classpath:/spring-jdbc.xml", "classpath:/spring-mvc.xml"})
public class UserControllerTest extends AbstractControllerTestNGTest {

    @Autowired
    private UserController userController;

    @Override
    protected Object getController() {
        return userController;
    }

    @Test
    public void findUserById() throws Exception {
        Object[] objects = new Object[]{1};
        getMock("/user/{id}", objects, "home");
    }

    @Test
    public void updateUserById() throws Exception {
        String params = "username=zhangwei&password=111111)";
        postMock("/user/1",params, "home");
    }

    @Test
    public void insertUser() throws Exception {
        String params = "username=victor&password=111111&gmtCreate=2018-01-03 10:12:30&gmtModified=2018-01-03 10:12:30&status=0";
        putMock("/user", params, "home");
    }

    @Test
    public void deleteUserById() throws Exception {
        String params = "id=2";
        deleteMock("/user/2", params, "home");
    }
}
