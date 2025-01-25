package com.visnis.in.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.visnis.in.request.AddDepartmentRequest;
import com.visnis.in.request.PermissionRequest;
import com.visnis.in.request.RegistrationRequest;
import com.visnis.in.response.Response;
import com.visnis.in.service.IDepartmentService;
import com.visnis.in.service.IUserDetailsService;
import com.visnis.in.service.IUserPemissionService;

@RestController
@RequestMapping("/api/admin")
public class AdminController {
	@Autowired
	private IUserDetailsService userDetailsService;
	@Autowired
	private IDepartmentService departmentService;
	@Autowired
	private IUserPemissionService pemissionService;
//	public UserController(IUserDetailsService userDetailsService) {
//		this.UserDetailsService = userDetailsService;
//	}

	@GetMapping("/test")
	public ResponseEntity<String> test() {
		return new ResponseEntity<>("this application working properly", HttpStatus.OK);
	}

	@PostMapping("/register")
	public ResponseEntity<Response> userRegister(@RequestBody @Validated RegistrationRequest request) {
		return userDetailsService.userRegister(request);
	}

	@PostMapping("/add-departments")
	public ResponseEntity<Response> addDepartment(@RequestBody @Validated AddDepartmentRequest request) {
		return departmentService.addDepartment(request);
	}

	@PostMapping("/add-pemissions")
	public ResponseEntity<Response> addPemissions(@RequestBody PermissionRequest request) {
		return pemissionService.addPemissions(request);
	}
}
