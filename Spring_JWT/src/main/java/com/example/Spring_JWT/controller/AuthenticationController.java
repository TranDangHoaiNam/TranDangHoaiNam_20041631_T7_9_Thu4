/*
 *@ (#) .java  1.0
 *
 *Copyright (C) 2024 IUH. All rights reserved
 */


package com.example.Spring_JWT.controller;/*
 *
 *@description:
 *@author: Trần Đặng Hoài Nam
 *@date:   1/22/2024
 *vesion: 1.0
 */

import com.example.Spring_JWT.dtos.AuthenticationRequest;
import com.example.Spring_JWT.dtos.AuthenticationResponse;
import com.example.Spring_JWT.services.jwt.UserDetailsServicelmpl;
import com.example.Spring_JWT.utils.JwtUtil;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.naming.NameNotFoundException;
import java.io.IOException;
import java.security.DigestException;

@RestController
public class AuthenticationController {
    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private UserDetailsServicelmpl userDetailsService;
    @Autowired
    private JwtUtil jwtUtil;
    @PostMapping("/authentication")
    public AuthenticationResponse createAuthenticationToken(@RequestBody AuthenticationRequest authenticationRequest, HttpServletResponse response) throws BadCredentialsException,DigestException, NameNotFoundException, IOException {
        try{
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authenticationRequest.getEmail(),authenticationRequest.getPassword()));
        }catch (BadCredentialsException e){
            throw  new BadCredentialsException("Incorrect User Name or Password");
        }
        final UserDetails userDetails = userDetailsService.loadUserByUsername(authenticationRequest.getEmail());
        final  String jwt  = jwtUtil.generateToken(userDetails.getUsername());
        return new AuthenticationResponse(jwt);
    }
}



