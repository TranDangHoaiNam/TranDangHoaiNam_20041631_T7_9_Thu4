/*
 *@ (#) .java  1.0
 *
 *Copyright (C) 2024 IUH. All rights reserved
 */

package com.example.Spring_JWT.repositories;


import com.example.Spring_JWT.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*
 *
 *@description:
 *@author: Trần Đặng Hoài Nam
 *@date:   1/22/2024
 *vesion: 1.0
 */
@Repository
public interface UserRepository  extends JpaRepository <User, Long> {
    User findFirstByEmail(String email);
}



