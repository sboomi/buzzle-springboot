package com.buzzle.springboot.entity;

import com.buzzle.springboot.entity.User;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="messages")
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;
    protected String category;
    protected String title;
    protected User user;
    protected List<String> hashtags;
    protected Date currentDate;
    protected int nbrOfLikes;

    public Message() {
    }

    public Message( String title, User user, List<String> hashtags) {
        this.title = title;
        this.user = user;
        if (this.hashtags.isEmpty()){
            hashtags = new ArrayList<>();
        }
        this.currentDate = new Date();;
        this.nbrOfLikes = 0;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<String> getHashtags() {
        return hashtags;
    }

    public void setHashtags(List<String> hashtags) {
        this.hashtags = hashtags;
    }

    public Date getCurrentDate() {
        return currentDate;
    }

    public void setCurrentDate(Date currentDate) {
        this.currentDate = currentDate;
    }

    public int getNbrOfLikes() {
        return nbrOfLikes;
    }

    public void setNbrOfLikes(int nbrOfLikes) {
        this.nbrOfLikes = nbrOfLikes;
    }
}
