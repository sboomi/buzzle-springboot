package com.buzzle.springboot.entity;

import com.buzzle.springboot.entity.User;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity //@MappedSuperClass
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Table(name="messages")
public abstract class Message implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    protected Long id;
    @Column(name="category")
    protected String category;
    @Column(name="title")
    protected String title;
    @Column(name="hashtags")
    protected String hashtagChain;
    @Column(name="date")
    @Temporal(TemporalType.TIMESTAMP)
    protected Date currentDate;
    //Use Jodatime it's better
    @Column(name="likes")
    protected int nbrOfLikes;

    @ManyToOne
    @JoinColumn(name="blogs_id", insertable=false, updatable = false)//@MapsId("blog_id")
    protected Blog blog;

    public Message() {
    }

    public Message(String title, String hashtagChain, Date currentDate, int nbrOfLikes) {
        this.title = title;
        this.hashtagChain = hashtagChain;
        this.currentDate = new Date();
        this.nbrOfLikes = 0;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getHashtagChain() {
        return hashtagChain;
    }

    public void setHashtagChain(String hashtagChain) {
        this.hashtagChain = hashtagChain;
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

    public Blog getBlog() {
        return blog;
    }

    public void setBlog(Blog blog) {
        this.blog = blog;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", category='" + category + '\'' +
                ", title='" + title + '\'' +
                ", hashtagChain='" + hashtagChain + '\'' +
                ", currentDate=" + currentDate +
                ", nbrOfLikes=" + nbrOfLikes +
                ", blog=" + blog +
                ", blogs=" + blogs +
                '}';
    }

    @ManyToOne(optional = false)
    private Blog blogs;

    public Blog getBlogs() {
        return blogs;
    }

    public void setBlogs(Blog blogs) {
        this.blogs = blogs;
    }
}
