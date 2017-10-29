package com.alibaba.venus.model;

/**
 * @author zhaoxingming on 17/10/24.
 * @version 1.0
 */
public class User {

    private Long id;


    private String username;


    private String password;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
