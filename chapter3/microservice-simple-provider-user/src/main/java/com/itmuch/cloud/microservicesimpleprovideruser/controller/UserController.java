package com.itmuch.cloud.microservicesimpleprovideruser.controller;

import com.itmuch.cloud.microservicesimpleprovideruser.dao.UserRepository;
import com.itmuch.cloud.microservicesimpleprovideruser.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author:crelle
 * @className:UserController
 * @version:1.0.0
 * @date:2020/10/12
 * @description:XX
 **/
@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/user/{id}")
    public User findById(@PathVariable Long id){
        User findOne = this.userRepository.getOne(id);
        return findOne;
    }

    @PostMapping("/user")
    public User saveUser(User user){
       return this.userRepository.save(user);
    }


}
