package com.buzzle.springboot.entity.message;

import com.buzzle.springboot.entity.Message;
import com.buzzle.springboot.entity.User;

import java.util.Date;
import java.util.List;

public class MessageAudio extends Message {
    private String audioFile;

    public MessageAudio() {
    }

    public MessageAudio(String title, User user, List<String> hashtags) {
        super(title, user, hashtags);
        super.category = "Audio";
    }
}
