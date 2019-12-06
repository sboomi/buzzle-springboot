package com.buzzle.springboot.entity.message;

import com.buzzle.springboot.entity.Message;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="messages_video")
public class MessageVideo extends Message implements Serializable {
    @Column(name="content")
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

    @Override
    public String toString() {
        return "MessageVideo{" +
                "videoLink='" + videoLink + '\'' +
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
