package com.buzzle.springboot.entity.message;

import com.buzzle.springboot.entity.Message;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="messages_link")
public class MessageLink extends Message implements Serializable {
    @Column(name="content")
    private String url;

    public MessageLink() {
    }

    public MessageLink(String title, String hashtagChain, Date currentDate, int nbrOfLikes, String url) {
        super(title, hashtagChain, currentDate, nbrOfLikes);
        this.category = "Link";
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "MessageLink{" +
                "url='" + url + '\'' +
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
