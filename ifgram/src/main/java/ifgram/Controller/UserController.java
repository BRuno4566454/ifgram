package ifgram.Controller;

import ifgram.dto.UserRequest;
import ifgram.dto.UserResponse;
import ifgram.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("users")
public class UserController {
    public final UserService service;

    public UserController(UserService service) {
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