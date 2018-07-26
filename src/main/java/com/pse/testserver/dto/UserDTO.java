package com.pse.testserver.dto;


import java.util.List;


public class UserDTO {

    private String name;
    private String email;
    private String imageUrl;
    private List<UserDTO> subscriptions;
    private List<UserDTO> subscribers;
    private List<GroupDTO> joinedGroups;
    private List<EventDTO> participatedEvents;
    private List<PostDTO> likedPosts;
    private List<PostDTO> createdPosts;
    private List<GroupDTO> createdGroups;
    private List<EventDTO> createdEvents;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public List<UserDTO> getSubscriptions() {
        return subscriptions;
    }

    public void setSubscriptions(List<UserDTO> subscriptions) {
        this.subscriptions = subscriptions;
    }

    public List<UserDTO> getSubscribers() {
        return subscribers;
    }

    public void setSubscribers(List<UserDTO> subscribers) {
        this.subscribers = subscribers;
    }

    public List<GroupDTO> getJoinedGroups() {
        return joinedGroups;
    }

    public void setJoinedGroups(List<GroupDTO> joinedGroups) {
        this.joinedGroups = joinedGroups;
    }

    public List<EventDTO> getParticipatedEvents() {
        return participatedEvents;
    }

    public void setParticipatedEvents(List<EventDTO> participatedEvents) {
        this.participatedEvents = participatedEvents;
    }

    public List<PostDTO> getLikedPosts() {
        return likedPosts;
    }

    public void setLikedPosts(List<PostDTO> likedPosts) {
        this.likedPosts = likedPosts;
    }

    public List<PostDTO> getCreatedPosts() {
        return createdPosts;
    }

    public void setCreatedPosts(List<PostDTO> createdPosts) {
        this.createdPosts = createdPosts;
    }

    public List<GroupDTO> getCreatedGroups() {
        return createdGroups;
    }

    public void setCreatedGroups(List<GroupDTO> createdGroups) {
        this.createdGroups = createdGroups;
    }

    public List<EventDTO> getCreatedEvents() {
        return createdEvents;
    }

    public void setCreatedEvents(List<EventDTO> createdEvents) {
        this.createdEvents = createdEvents;
    }
}
