package com.buzzle.springboot.entity.message;

import com.buzzle.springboot.entity.Message;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="messages_text")
public class MessageText extends Message implements Serializable {
    @Column(name="content")
    @Lob
    private String text; //HTML embedded

    public MessageText() {
    }

    public MessageText(String title, String hashtagChain, Date currentDate, int nbrOfLikes, String text) {
        super(title, hashtagChain, currentDate, nbrOfLikes);
        this.category = "Text";
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "MessageText{" +
                "text='" + text + '\'' +
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
