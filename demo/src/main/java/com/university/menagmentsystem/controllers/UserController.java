package com.university.menagmentsystem.controllers;

import com.university.menagmentsystem.models.User;
import com.university.menagmentsystem.repository.UserRepoWithEntityManager;
import com.university.menagmentsystem.repository.UserRepository;
import com.university.menagmentsystem.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/ums/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserService userService;

    @Autowired
    private UserRepoWithEntityManager userRepoWithEntityManager;

    @PostMapping(path = "/add")
    public @ResponseBody
    User addNewUser(@RequestParam String firstName, @RequestParam String lastName, @RequestParam String email) {

        User user = new User();
        user.setUsername(user.getUsername());
        user.setEmail(email);
//        userRepository.save(user);
        userService.saveUser(user);
        return user;
    }

    @GetMapping(path = "/all")
    public @ResponseBody Iterable < User > getAllUsers() {
        return userRepository.findAll();
    }

    @GetMapping(path = "/get/{id}")
    public @ResponseBody User GetById(@PathVariable("id") Long id) {
        return userRepoWithEntityManager.getById(id).orElse(new User());
    }

}
