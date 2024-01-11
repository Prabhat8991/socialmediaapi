package com.socialmediaapi.demo.post;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.socialmediaapi.demo.user.User;
import jakarta.persistence.*;

@Entity
public class Post {

    protected Post() {

    }

    @Id @GeneratedValue
    private int id;

    private String message;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    private User user;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
