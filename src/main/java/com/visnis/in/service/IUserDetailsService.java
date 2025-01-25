package com.visnis.in.service;

import org.springframework.http.ResponseEntity;

import com.visnis.in.request.RegistrationRequest;
import com.visnis.in.response.Response;

public interface IUserDetailsService {

	ResponseEntity<Response> userRegister(RegistrationRequest request);

}
