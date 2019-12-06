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
@Table(name="messages_audio")
public class MessageAudio extends Message implements Serializable {
    @Column(name="content")
    private String audioUrl;

    public MessageAudio() {
    }

    public MessageAudio(String title, String hashtagChain, Date currentDate, int nbrOfLikes, String audioUrl) {
        super(title, hashtagChain, currentDate, nbrOfLikes);
        this.category = "Audio";
        this.audioUrl = audioUrl;
    }

    public String getAudioUrl() {
        return audioUrl;
    }

    public void setAudioUrl(String audioUrl) {
        this.audioUrl = audioUrl;
    }

    @Override
    public String toString() {
        return "MessageAudio{" +
                "audioUrl='" + audioUrl + '\'' +
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
