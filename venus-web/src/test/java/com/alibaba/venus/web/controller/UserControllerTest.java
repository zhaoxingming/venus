package com.alibaba.venus.web.controller;

import com.alibaba.venus.model.User;
import com.alibaba.venus.service.UserService;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

/**
 * @author zhaoxingming on 17/10/24.
 * @version 1.0
 */
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = WebTestConfig.class)
@WebMvcTest
public class UserControllerTest {


    @Autowired
    private UserController userController;

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private UserService userService;

    @Test
    public void contextLoads() throws Exception {
        Assert.assertNotNull(userController);
    }

    @Test
    public void testGetUserById() throws Exception{
        User user=new User();
        user.setId(1l);
        user.setPassword("mypass");
        user.setUsername("xingming.zhaoxm");
        when(userService.getUserById(1l)).thenReturn(user);
        this.mockMvc.perform(get("/getUserId.json?id=1")).andDo(print()).andExpect(status().isOk())
            .andExpect(content().json("{\"id\":1,\"username\":\"xingming.zhaoxm\",\"password\":\"mypass\"}"));
    }
}
