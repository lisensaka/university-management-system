package com.university.menagmentsystem.services.impl;

import com.university.menagmentsystem.models.User;
import com.university.menagmentsystem.repository.UserRepository;
import com.university.menagmentsystem.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User saveUser(User user) {
        return this.userRepository.save(user);
    }
}
