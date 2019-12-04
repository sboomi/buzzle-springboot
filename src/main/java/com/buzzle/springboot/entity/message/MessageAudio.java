package com.buzzle.springboot.entity.message;

import com.buzzle.springboot.entity.Message;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MessageAudio extends Message {
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
}
