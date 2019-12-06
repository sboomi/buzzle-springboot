package com.buzzle.springboot.service.impl;

import com.buzzle.springboot.entity.User;
import com.buzzle.springboot.repository.UserRepository;
import com.buzzle.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> findAll() {
        var users = (List<User>) userRepository.findAll();
        return users;
    }
}
