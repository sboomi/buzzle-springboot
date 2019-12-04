package com.buzzle.springboot.entity.message;

import com.buzzle.springboot.entity.Message;

import java.util.Date;

public class MessageVideo extends Message {
    private String videoLink;

    public MessageVideo() {
    }

    public MessageVideo(String title, String hashtagChain, Date currentDate, int nbrOfLikes, String videoLink) {
        super(title, hashtagChain, currentDate, nbrOfLikes);
        this.category = "Video";
        this.videoLink = videoLink;
    }

    public String getVideoLink() {
        return videoLink;
    }

    public void setVideoLink(String videoLink) {
        this.videoLink = videoLink;
    }
}
