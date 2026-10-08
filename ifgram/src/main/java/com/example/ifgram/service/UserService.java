package com.example.ifgram.service;

import com.example.ifgram.Dto.UserRequest;
import com.example.ifgram.Dto.UserResponse;
import com.example.ifgram.Repository.UserRepository;
import jakarta.transaction.Transactional;
import org.apache.catalina.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository repository;

    
    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    @Transactional
    public UserResponse criar(UserRequest request) throws Exception {

        if (repository.existsByEmail(request.email())) {
            throw new Exception(request.email());
        }

        User salvo = repository.save(new User(request.nome(), request.email()));
        return UserResponse.from(salvo);
    }
}
