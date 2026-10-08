package com.example.ifgram.Dto;

import org.apache.catalina.User;

public record UserResponse (Long Id, String Nome, String email){
    public static UserResponse from(User user) {
        return new UserResponse(user.getId(), user.getNome(), user.getEmail());
    }
}

