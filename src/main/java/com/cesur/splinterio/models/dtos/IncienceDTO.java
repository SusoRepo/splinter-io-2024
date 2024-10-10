package com.cesur.splinterio.models.dtos;

import com.cesur.splinterio.models.User;

public class IncienceDTO {
    private Long id;
    private String category;
    private String description;
    private String priority;
    private User userCreated;

    public IncienceDTO(Long id, String category, String description, String priority, User userCreated) {
        this.id = id;
        this.category = category;
        this.description = description;
        this.priority = priority;
        this.userCreated = userCreated;
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
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getPriority() {
        return priority;
    }
    public void setPriority(String priority) {
        this.priority = priority;
    }
    public User getUserCreated() {
        return userCreated;
    }
    public void setUserCreated(User userCreated) {
        this.userCreated = userCreated;
    }
    
}
