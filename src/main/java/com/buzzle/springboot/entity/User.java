package com.buzzle.springboot.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    /**<b>Notice:</b>
     * <p>Always name your columns according to your database</p>
     * <p>They are case-sensitive; be careful</p>
     * <p>Idk how to put another scheman than the main one (public)</p>
     * */


    @Column(name = "username")
    private String userName;

    @Column(name = "password")
    private String password;

    @Column(name = "mail")
    private String mail;
    //private List<Blog> blogs;

    public User() {
    }

    public User(String userName, String password, String mail) {
        this.userName = userName;
        this.password = password;
        this.mail = mail;
        /*if(this.blogs.isEmpty()){
            this.blogs = new ArrayList<>();
        }*/
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    /*public List<Blog> getBlogs() {
        return blogs;
    }

    public void setBlogs(List<Blog> blogs) {
        this.blogs = blogs;
    }*/

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", mail='" + mail + '\'' +
                //", blogs=" + blogs +
                '}';
    }
}
