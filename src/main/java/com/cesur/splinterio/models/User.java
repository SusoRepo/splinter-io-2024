package com.cesur.splinterio.models;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "splint_user")
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "username", length = 8)
    private String username;
    @Column(name = "password", length = 16)
    private String password;
    @Column(name = "name", length = 50)
    private String name;
    @Column(name = "birthDate")
    private String birthDate;
    @Column(name = "lastUpdate")
    private LocalDateTime lastUpdate;
    @Column(name = "deletedAt")
    private LocalDateTime deletedAt;
    @Column(name = "createdAt")
    private LocalDateTime createdAt;

    public User() {
    }

    public User(
            Long id,
            String username,
            String password,
            String name,
            String birthDate,
            LocalDateTime lastUpdate,
            LocalDateTime deletedAt,
            LocalDateTime createdAt) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.name = name;
        this.birthDate = birthDate;
        this.lastUpdate = lastUpdate;
        this.deletedAt = deletedAt;
        this.createdAt = createdAt;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getDeletedAt() {
        return deletedAt;
    }

    public Long getId() {
        return id;
    }

    public LocalDateTime getLastUpdate() {
        return lastUpdate;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void setDeletedAt(LocalDateTime deletedAt) {
        this.deletedAt = deletedAt;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setLastUpdate(LocalDateTime lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
