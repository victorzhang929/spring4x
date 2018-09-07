package com.vz.spring4x.testng.domain;

import lombok.Data;

/**
 * 用户模型
 * @author zhangwei
 * @email zhangwei@cetiti.com
 * @date 2018-01-03 09:42:28
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
