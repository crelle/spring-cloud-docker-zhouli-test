package com.itmuch.cloud.microserivceprovideruser.controller;

import com.itmuch.cloud.microserivceprovideruser.dao.UserRepository;
import com.itmuch.cloud.microserivceprovideruser.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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

    @GetMapping("/user")
    public List<User> findAll(){
        return this.userRepository.findAll();
    }

    @PostMapping("/user")
    public User saveUser(User user){
       return this.userRepository.save(user);
    }


}
