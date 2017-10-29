package com.alibaba.venus.web.controller;

import com.alibaba.venus.model.User;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author zhaoxingming on 17/10/24.
 * @version 1.0
 */
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = ApplicationTestConfig.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@MapperScan("com.alibaba.venus.persistence.mapper")
@TestPropertySource(locations="classpath:application-test.properties")
public class UserControllerIntegrationTest {

    @LocalServerPort
    private int port;

    @Autowired
    private UserController userController;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void contextLoads() throws Exception {
        Assert.assertNotNull(userController);
    }

    @Test
    public void testGetUserById(){
        User user=restTemplate.getForObject("http://localhost:" + port + "/getUserId.json?id=1",
            User.class);
        Assert.assertNotNull(user);
        Assert.assertEquals(1l,user.getId().longValue());
    }
}
