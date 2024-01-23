/*
 *@ (#) .java  1.0
 *
 *Copyright (C) 2024 IUH. All rights reserved
 */


package com.example.Spring_JWT.services;/*
 *
 *@description:
 *@author: Trần Đặng Hoài Nam
 *@date:   1/22/2024
 *vesion: 1.0
 */

import com.example.Spring_JWT.dtos.SignupRequest;
import com.example.Spring_JWT.dtos.UserDTO;
import com.example.Spring_JWT.models.User;
import com.example.Spring_JWT.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthServicelmpl implements AuthService{
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDTO createUser(SignupRequest signupRequest) {
        User user = new User();
        user.setEmail(signupRequest.getEmail());
        user.setName(signupRequest.getName());
        user.setPhone(signupRequest.getPhone());
        user.setPassword(new BCryptPasswordEncoder().encode(signupRequest.getPassword()));
        User createdUSer = userRepository.save(user);
        UserDTO userDTO = new UserDTO();
        userDTO.setEmail(createdUSer.getEmail());
        userDTO.setName(createdUSer.getName());
        userDTO.setPhone(createdUSer.getPhone());
        return userDTO;
    }
}



