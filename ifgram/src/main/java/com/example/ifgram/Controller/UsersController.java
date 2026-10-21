package com.example.ifgram.Controller;

import com.example.ifgram.Dto.UserRequest;
import com.example.ifgram.Dto.UserResponse;
import com.example.ifgram.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("users")
public class UsersController {
    public final UserService service;

    public UsersController(UserService service) {
        this.service = service;
    }

    @GetMapping
    public String getUser() {
        return "get user was called";
    }


    @PostMapping
    public String postUser() {
        return "chamei o endpoint como um POST!";
    }

    @DeleteMapping
    public String deleteUser(){
        return "chamei o endpoint como um DELETE!";
    }

    @PutMapping
    public UserResponse UpdateUser(UserRequest request) throws Exception {
        return service.atualizarUsuario(request);
    }

    @PatchMapping
    public String pacthUser() {
        return "chamei o endpoint como um PUT!";
    }
}