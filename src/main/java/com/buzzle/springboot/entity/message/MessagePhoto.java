package com.buzzle.springboot.entity.message;

import com.buzzle.springboot.entity.Message;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="messages_photo")
public class MessagePhoto extends Message implements Serializable {
    @Column(name="content")
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

    @Override
    public String toString() {
        return "MessagePhoto{" +
                "photoBatch='" + photoBatch + '\'' +
                ", id=" + id +
                ", category='" + category + '\'' +
                ", title='" + title + '\'' +
                ", hashtagChain='" + hashtagChain + '\'' +
                ", currentDate=" + currentDate +
                ", nbrOfLikes=" + nbrOfLikes +
                ", blog=" + blog +
                '}';
    }
}
