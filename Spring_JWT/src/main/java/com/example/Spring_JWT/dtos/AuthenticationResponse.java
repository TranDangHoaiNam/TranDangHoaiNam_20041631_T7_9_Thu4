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

@Data

public class AuthenticationResponse {
    private  String jwt;

	public String getJwt() {
		return jwt;
	}

	public void setJwt(String jwt) {
		this.jwt = jwt;
	}

	public AuthenticationResponse() {
		super();
	}

	public AuthenticationResponse(String jwt) {
		super();
		this.jwt = jwt;
	}
    
    

}



