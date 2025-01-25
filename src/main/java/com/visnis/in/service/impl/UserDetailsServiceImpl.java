package com.visnis.in.service.impl;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.visnis.in.dao.UserDetailsRepository;
import com.visnis.in.entity.UserDetails;
import com.visnis.in.request.RegistrationRequest;
import com.visnis.in.response.Response;
import com.visnis.in.service.IUserDetailsService;
@Service
public class UserDetailsServiceImpl implements IUserDetailsService{
@Autowired
	private UserDetailsRepository userDetailsRepository;
	
	@Override
	public ResponseEntity<Response> userRegister(RegistrationRequest request) {
		Response response=new Response();
		if(request==null) {
			response.setMessage("all fields are mandetory");
			response.setStatusCode("0");
			return new ResponseEntity<>(response,HttpStatus.BAD_REQUEST);
		}
		UserDetails details=userDetailsRepository.findByPhoneNamber(request.getPhoneNamber());
		if(details!=null) {
			response.setMessage("User already exist..");
			response.setStatusCode("0");
			return new ResponseEntity<>(response,HttpStatus.BAD_REQUEST);
		}
		UserDetails userDetails=new UserDetails();
		userDetails.setFirstName(request.getFirstName());
		userDetails.setMiddelName(request.getMiddelName());
		userDetails.setLastName(request.getLastName());
		LocalDate dob=LocalDate.parse(request.getDob());
		userDetails.setDob(dob);
		userDetails.setPassword(request.getPassword());
		userDetails.setContry(request.getContry());
		userDetails.setPhoneNamber(request.getPhoneNamber());
		userDetails.setCreatedDate(LocalDateTime.now());
		userDetails.setStatus("Pending");
		
		UserDetails save = userDetailsRepository.save(userDetails);
		if(save!=null) {
			response.setMessage(save.getFirstName()+" Registered successfully");
			response.setStatusCode("1");
			return new ResponseEntity<>(response,HttpStatus.OK);
		}
		return null;
	}

}
