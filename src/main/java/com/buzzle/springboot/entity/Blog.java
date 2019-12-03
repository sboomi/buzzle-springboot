package com.buzzle.springboot.entity;

import java.util.List;

public class Blog {
    private Long id;
    private String nameDomain;
    private User user;
    private List<Message> messages;
    private String title;
}
