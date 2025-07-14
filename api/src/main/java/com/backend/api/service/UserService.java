package com.backend.api.service;

import com.backend.api.model.User;
import com.backend.api.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public List<User> create (User user){
        userRepository.save(user);
        return list();
    }

    public List<User> list (){
        return userRepository.findAll();
    }

    public List<User> update(User user){
        userRepository.save(user);
        return list();
    }

    public List<User> delete(String id){
        userRepository.deleteById(String.valueOf(id));
        return list();
    }

}
