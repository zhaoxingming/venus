package com.alibaba.venus.persistence.mapper;

import com.alibaba.venus.persistence.entity.UserEntity;

import org.apache.ibatis.annotations.Mapper;

/**
 * @author zhaoxingming on 17/10/20.
 * @version 1.0
 */
@Mapper
public interface UserMapper {

    UserEntity getUserById(Long id);

    void deleteUserById(Long id);
}
