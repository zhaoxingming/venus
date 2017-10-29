package com.alibaba.venus.service.impl;

import com.alibaba.venus.model.User;
import com.alibaba.venus.persistence.entity.UserEntity;
import com.alibaba.venus.persistence.mapper.UserMapper;
import com.alibaba.venus.service.UserService;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import static org.mockito.Mockito.when;

/**
 * @author zhaoxingming on 17/10/24.
 * @version 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = UserServiceImpl.class)
public class UserServiceImplTest {

    @MockBean
    private UserMapper userMapper;

    @Autowired
    private UserService UserServiceImpl;


    @Test
    public void testGetUserById(){
        UserEntity userEntity=new UserEntity();
        userEntity.setId(10001l);
        userEntity.setUsername("xingming.zhaoxm");
        userEntity.setPassword("xxxxxx");
        when(userMapper.getUserById(10001l)).thenReturn(userEntity);
        User user = UserServiceImpl.getUserById(10001l);
        Assert.assertNotNull(user);
    }
}
