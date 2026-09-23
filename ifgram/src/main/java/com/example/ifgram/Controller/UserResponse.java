package com.example.ifgram.Controller;

public class UserResponse (Long Id, String Nome, String Email){
    public static UserResponse from(User user){
        return new UserResponse(user.getId(), user.getNome(), user.getEmail())

    }
}
