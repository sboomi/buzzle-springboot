package com.buzzle.springboot.entity.message;

import com.buzzle.springboot.entity.Message;

import java.util.Date;

public class MessageText extends Message {
    private String text; //HTML embedded

    public MessageText() {
    }

    public MessageText(String title, String hashtagChain, Date currentDate, int nbrOfLikes, String text) {
        super(title, hashtagChain, currentDate, nbrOfLikes);
        this.category = "Text";
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
