package com.buzzle.springboot.service;

import com.buzzle.springboot.entity.User;

import java.util.List;

public interface UserService {

    List<User> findAll();
}
