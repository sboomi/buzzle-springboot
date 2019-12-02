package com.buzzle.springboot.entity;

import com.buzzle.springboot.entity.message.Message;

import java.util.List;

public class Blog {
    private Long id;
    private User user;
    private List<Message> messages;
    private String title;
}
