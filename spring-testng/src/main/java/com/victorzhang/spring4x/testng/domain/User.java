package com.victorzhang.spring4x.testng.domain;

import lombok.Data;

/**
 * @author zhangwei
 * @email zhangwei@cetiti.com
 * @create 2018-01-03 09:42:28
 */
@Data
public class User {
    private Integer id;
    private String username;
    private String password;
    private String gmtCreate;
    private String gmtModified;
    private Integer status;
}
