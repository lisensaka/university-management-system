package com.university.menagmentsystem.controllers;

import com.university.menagmentsystem.models.User;
import com.university.menagmentsystem.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/ums/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/add")
    public  User addNewUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

    @GetMapping( "/all")
    public List< User > getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/get/{id}")
    public Optional<User> GetById(@PathVariable("id") Long id) {
        return userService.findUserById(id);
    }

}
