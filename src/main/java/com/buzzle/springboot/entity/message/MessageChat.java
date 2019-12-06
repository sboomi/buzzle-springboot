package com.buzzle.springboot.entity.message;

import com.buzzle.springboot.entity.Message;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="messages_chat")
public class MessageChat extends Message implements Serializable {
    @Column(name="content")
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

    @Override
    public String toString() {
        return "MessageChat{" +
                "dialog='" + dialog + '\'' +
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
