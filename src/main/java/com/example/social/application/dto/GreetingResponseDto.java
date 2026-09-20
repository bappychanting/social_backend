package com.example.social.application.dto;

import java.time.LocalDateTime;

public class GreetingResponseDto {
    private String greeting;
    private Long userId;
    private String userName;
    private String userEmail;
    private LocalDateTime timestamp;
    private String databaseStatus;

    public GreetingResponseDto() {
    }

    public GreetingResponseDto(String greeting, Long userId, String userName, String userEmail, LocalDateTime timestamp, String databaseStatus) {
        this.greeting = greeting;
        this.userId = userId;
        this.userName = userName;
        this.userEmail = userEmail;
        this.timestamp = timestamp;
        this.databaseStatus = databaseStatus;
    }

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public String getDatabaseStatus() {
        return databaseStatus;
    }

    public void setDatabaseStatus(String databaseStatus) {
        this.databaseStatus = databaseStatus;
    }
}
