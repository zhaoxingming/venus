package com.alibaba.venus.service;

import com.alibaba.venus.model.User;

/**
 * @author zhaoxingming on 17/10/24.
 * @version 1.0
 */
public interface UserService {

    /**
     *
     * @param id
     * @return
     */
    User getUserById(Long id);
}
