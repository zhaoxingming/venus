package com.alibaba.venus.service.impl;

import javax.annotation.Resource;

import com.alibaba.venus.model.User;
import com.alibaba.venus.persistence.entity.UserEntity;
import com.alibaba.venus.persistence.mapper.UserMapper;
import com.alibaba.venus.service.UserService;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

/**
 * @author zhaoxingming on 17/10/24.
 * @version 1.0
 */
@Service
public class UserServiceImpl implements UserService{

    @Resource
    private UserMapper userMapper;

    @Override
    public User getUserById(Long id) {
        User user=new User();
        UserEntity userEntity=userMapper.getUserById(id);
        BeanUtils.copyProperties(userEntity,user);
        return user;
    }
}
