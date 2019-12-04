package com.buzzle.springboot.entity.message;

import com.buzzle.springboot.entity.Message;

import java.util.Date;

public class MessageQuote extends Message {
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
}
