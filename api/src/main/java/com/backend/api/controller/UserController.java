package com.backend.api.controller;

import com.backend.api.model.User;
import com.backend.api.repository.UserRepository;
import com.backend.api.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @PostMapping
    ResponseEntity<List<User>> create (@RequestBody User user){
        List<User> users = userService.create(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(users);
    }

    @GetMapping
    List<User> list(){
        return userService.list();
    }

    @PutMapping
    List<User> update(@RequestBody User user){
        return userService.update(user);
    }

    @DeleteMapping("{id}")
    List<User> delete (@PathVariable("id") Long id){
        return userService.delete(id);
    }
}
