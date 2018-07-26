package com.pse.testserver.dto;

import com.pse.testserver.entities.User;

import java.util.Date;
import java.util.List;

public class PostDTO {

    private int id;
    private String text;
    private User creator;
    private Date date;
    private int owned_by;
    private List<UserDTO> likedUsers;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public User getCreator() {
        return creator;
    }

    public void setCreator(User creator) {
        this.creator = creator;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getOwned_by() {
        return owned_by;
    }

    public void setOwned_by(int owned_by) {
        this.owned_by = owned_by;
    }

    public List<UserDTO> getLikedUsers() {
        return likedUsers;
    }

    public void setLikedUsers(List<UserDTO> likedUsers) {
        this.likedUsers = likedUsers;
    }


}
