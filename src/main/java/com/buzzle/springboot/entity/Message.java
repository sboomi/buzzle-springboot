package com.buzzle.springboot.entity;

import com.buzzle.springboot.entity.User;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Message {
    protected Long id;
    protected String category;
    protected String title;
    protected String hashtagChain;
    protected Date currentDate;
    protected int nbrOfLikes;

    public Message() {
    }

    public Message(String title, String hashtagChain, Date currentDate, int nbrOfLikes) {
        this.title = title;
        this.hashtagChain = hashtagChain;
        this.currentDate = new Date();
        this.nbrOfLikes = 0;
    }
}
