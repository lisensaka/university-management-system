package com.university.menagmentsystem.services;


import com.university.menagmentsystem.models.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    public User saveUser(User user);
    List<User> getAllUsers();
    Optional<User> findUserById(Long id);
}
