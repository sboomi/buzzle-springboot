package com.buzzle.springboot.entity.message;

import com.buzzle.springboot.entity.Message;

import java.util.Date;

public class MessageChat extends Message {
    private String dialog;

    public MessageChat() {
    }

    public MessageChat(String title, String hashtagChain, Date currentDate, int nbrOfLikes, String dialog) {
        super(title, hashtagChain, currentDate, nbrOfLikes);
        this.category = "Chat";
        this.dialog = dialog;
    }

    public String getDialog() {
        return dialog;
    }

    public void setDialog(String dialog) {
        this.dialog = dialog;
    }
}
