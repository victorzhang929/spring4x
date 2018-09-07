package com.vz.spring4x.testng.controller;

import com.vz.spring4x.testng.domain.User;
import com.vz.spring4x.testng.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 用户管理控制器
 *
 * @author zhangwei
 * @email zhangwei@cetiti.com
 * @date 2018-01-03 09:43:37
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.PUT)
    @ResponseBody
    public String insertUser(User user) {
        userService.insertUser(user);
        return "home";
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    @ResponseBody
    public String findUserById(@PathVariable("id") Integer id) {
        User user = userService.findUserById(id);
        System.out.println(user);
        return "home";
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.POST)
    @ResponseBody
    public String updateUserById(@PathVariable("id") Integer id, String username, String password) {
        userService.updateUserById(id, username, password);
        return "home";
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public String deleteUserById(@PathVariable("id") Integer id) {
        userService.deleteUserById(id);
        return "home";
    }
}
