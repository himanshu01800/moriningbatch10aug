package com.example.use.controler;

import com.example.use.entity.Users;
import com.example.use.repository.UsersRepository;
import com.example.use.service.UsersServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private final UsersServiceImp userService;

    public UserController(UsersServiceImp userService) {
        this.userService = userService;
    }


    @GetMapping("/addUser")
    public String addUser(Users user) {
       return "hi";
    }
}
