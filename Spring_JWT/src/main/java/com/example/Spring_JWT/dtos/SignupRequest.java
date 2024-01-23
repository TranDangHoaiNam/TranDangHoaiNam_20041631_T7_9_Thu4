/*
 *@ (#) .java  1.0
 *
 *Copyright (C) 2024 IUH. All rights reserved
 */


package com.example.Spring_JWT.dtos;/*
 *
 *@description:
 *@author: Trần Đặng Hoài Nam
 *@date:   1/22/2024
 *vesion: 1.0
 */

import lombok.AllArgsConstructor;
import lombok.Data;
@AllArgsConstructor

@Data
public class SignupRequest {
    private String name;
    private String email;
    private String password;
    private String phone;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

}



