package com.buzzle.springboot.entity.message;

import com.buzzle.springboot.entity.Message;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="messages_quote")
public class MessageQuote extends Message implements Serializable {
    @Column(name="content")
    private String quote;

    public MessageQuote() {
    }

    public MessageQuote(String title, String hashtagChain, Date currentDate, int nbrOfLikes, String quote) {
        super(title, hashtagChain, currentDate, nbrOfLikes);
        this.category = "Quote";
        this.quote = quote;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    @Override
    public String toString() {
        return "MessageQuote{" +
                "quote='" + quote + '\'' +
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
