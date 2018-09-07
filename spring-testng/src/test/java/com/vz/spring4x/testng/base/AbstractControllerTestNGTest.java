package com.vz.spring4x.testng.base;

import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.testng.annotations.BeforeClass;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * 控制层测试类
 *
 * @author zhangwei
 * @email zhangwei@cetiti.com
 * @date 2018-01-04 09:15:54
 */
public abstract class AbstractControllerTestNGTest extends AbstractTestNGTest {

    protected MockMvc mockMvc;

    protected abstract Object getController();

    @BeforeClass(alwaysRun = true)
    public void setup() {
        this.mockMvc = MockMvcBuilders.standaloneSetup(this.getController()).build();
    }

    protected void getMock(String url, Object[] objects, String expectedContent) throws Exception {
        MockHttpServletRequestBuilder builder = MockMvcRequestBuilders.get(url, objects);
        this.jsonRequestMock(builder, expectedContent);
    }

    protected void postMock(String url, String params, String expectedContent) throws Exception {
        MockHttpServletRequestBuilder builder = MockMvcRequestBuilders.post(url).content(params);
        this.jsonRequestMock(builder, expectedContent);
    }

    protected void putMock(String url, String params, String expectedContent) throws Exception {
        MockHttpServletRequestBuilder builder = MockMvcRequestBuilders.put(url).content(params);
        this.jsonRequestMock(builder, expectedContent);
    }

    protected void deleteMock(String url, String params, String expectedContent) throws Exception {
        MockHttpServletRequestBuilder builder = MockMvcRequestBuilders.delete(url).content(params);
        this.jsonRequestMock(builder, expectedContent);
    }

    private void jsonRequestMock(MockHttpServletRequestBuilder builder, String expectedContent) throws Exception {
        builder.contentType(MediaType.APPLICATION_FORM_URLENCODED).accept(MediaType.APPLICATION_JSON_UTF8).characterEncoding("UTF-8");

        this.mockMvc.perform(builder).andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(content().string(expectedContent));
    }
}
