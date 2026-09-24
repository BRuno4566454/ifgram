package service;

import Dto.UserRequest;
import Dto.UserResponse;
import jakarta.transaction.Transactional;

public class UserService {


    private final UserRepository repository;

    public UserService(UserRepository repository){
           this.repositor = repository;

    }

        @Transactional
    public UserResponse criar (UserRequest request) {
            if (repositor.existsByEmail(request.email())) {
     throw new EmailDuplicadoExpeption(request,email());
            }


        User salvo = repositor.save(new User(request.nome(), requestemail()));
            return UserResponse.from(salvo);


        }
}
