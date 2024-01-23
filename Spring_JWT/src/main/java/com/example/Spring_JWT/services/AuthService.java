/*
 *@ (#) .java  1.0
 *
 *Copyright (C) 2024 IUH. All rights reserved
 */

package com.example.Spring_JWT.services;


import com.example.Spring_JWT.dtos.SignupRequest;
import com.example.Spring_JWT.dtos.UserDTO;

/*
 *
 *@description:
 *@author: Trần Đặng Hoài Nam
 *@date:   1/22/2024
 *vesion: 1.0
 */
public interface AuthService {
    UserDTO createUser(SignupRequest signupRequest);
}


