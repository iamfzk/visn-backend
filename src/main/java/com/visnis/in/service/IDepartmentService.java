package com.visnis.in.service;

import org.springframework.http.ResponseEntity;

import com.visnis.in.request.AddDepartmentRequest;
import com.visnis.in.response.Response;

public interface IDepartmentService {

	ResponseEntity<Response> addDepartment(AddDepartmentRequest request);

	ResponseEntity<Response> getAllDepartments();

}
