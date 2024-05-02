package com.ancientdiv.demo.service;

import java.util.List;

// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ancientdiv.demo.dao.UserRepository;
import com.ancientdiv.demo.model.User;
@Service
public class UserServiceImpl implements UserService {

     private final UserRepository userRepository;

    // @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
    
}
