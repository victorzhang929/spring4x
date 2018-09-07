package com.vz.spring4x.testng.base;

import org.mockito.MockitoAnnotations;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.BeforeSuite;

/**
 * TestNG用户测试抽象类
 *
 * @author zhangwei
 * @email zhangwei@cetiti.com
 * @date 2018-01-04 09:14:32
 */
public abstract class AbstractTestNGTest extends AbstractTestNGSpringContextTests {

    @BeforeSuite(alwaysRun = true)
    public void init() {
        MockitoAnnotations.initMocks(this);
    }
}
