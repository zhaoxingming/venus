package com.alibaba.venus.persistence.mapper;

import com.alibaba.venus.persistence.entity.UserEntity;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author zhaoxingming on 17/10/24.
 * @version 1.0
 */
@RunWith(SpringRunner.class)
public class UserMapperTest extends BaseTester {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testGetUserById(){
        UserEntity userEntity = userMapper.getUserById(1l);
        Assert.assertNotNull(userEntity);
    }
}
