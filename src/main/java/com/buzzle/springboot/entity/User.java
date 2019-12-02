package com.buzzle.springboot.entity;

import java.util.List;

public class User {
    private Long id;

    private String userName;
    private String password;
    private String mail;
    private List<Blog> blogs;

    public User() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
