package com.buzzle.springboot.entity;



import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name="blogs")
public class Blog implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;


    /*@EmbeddedId
    BlogKey blogKeyId;*/

    @OneToMany(mappedBy = "blogs")
    private List<Message> messages;

    @ManyToOne
    @JoinColumn(name="id_user")
    //@MapsId("user_id")
    private User user;

    @Column(name="title")
    private String title;

    @Column(name="namedomain")
    private String nameDomain;

    public Blog() {
    }

    public Blog(String title, String nameDomain) {
        this.title = title;
        this.nameDomain = nameDomain;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNameDomain() {
        return nameDomain;
    }

    public void setNameDomain(String nameDomain) {
        this.nameDomain = nameDomain;
    }

    @Override
    public String toString() {
        return "Blog{" +
                "id=" + id +
                ", messages=" + messages +
                ", user=" + user +
                ", title='" + title + '\'' +
                ", nameDomain='" + nameDomain + '\'' +
                '}';
    }

    @ManyToOne(optional = false)
    private User users;

    public User getUsers() {
        return users;
    }

    public void setUsers(User users) {
        this.users = users;
    }
}
