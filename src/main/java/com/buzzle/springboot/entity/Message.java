package com.buzzle.springboot.entity;

import com.buzzle.springboot.entity.User;

import java.util.Date;
import java.util.List;

public class Message {
    protected Long id;
    protected String category;
    protected String title;
    protected User user;
    protected List<String> hashtags;
    protected Date currentDate;
    protected int nbrOfLikes;
}
