package com.buzzle.springboot.entity.message;

import com.buzzle.springboot.entity.Message;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MessagePhoto extends Message {
    private String photoBatch;

    public MessagePhoto() {
    }

    public MessagePhoto(String title, String hashtagChain, Date currentDate, int nbrOfLikes, String photoBatch) {
        super(title, hashtagChain, currentDate, nbrOfLikes);
        this.category = "Photo";
        this.photoBatch = photoBatch;
    }

    public String getPhotoBatch() {
        return photoBatch;
    }

    public void setPhotoBatch(String photoBatch) {
        this.photoBatch = photoBatch;
    }


}
