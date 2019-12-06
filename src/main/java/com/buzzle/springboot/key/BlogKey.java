package com.buzzle.springboot.key;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class BlogKey implements Serializable {
    @Column(name="user_id")
    Long userId;

    @Column(name="blog_id")
    Long blogId;

    public BlogKey() {

    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getBlogId() {
        return blogId;
    }

    public void setBlogId(Long blogId) {
        this.blogId = blogId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BlogKey blogKey = (BlogKey) o;
        return Objects.equals(userId, blogKey.userId) &&
                Objects.equals(blogId, blogKey.blogId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, blogId);
    }
}
