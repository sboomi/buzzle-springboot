package com.buzzle.springboot.service;

import com.buzzle.springboot.entity.Message;

import java.util.List;

public interface MessageService {

    List<Message> findAll();

}
