package com.buzzle.springboot.entity.message;

import com.buzzle.springboot.entity.Message;

import java.util.Date;

public class MessageLink extends Message {
    private String url;

    public MessageLink() {
    }

    public MessageLink(String title, String hashtagChain, Date currentDate, int nbrOfLikes, String url) {
        super(title, hashtagChain, currentDate, nbrOfLikes);
        this.category = "Link";
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
