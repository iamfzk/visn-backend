package com.visnis.in.service;

import org.springframework.http.ResponseEntity;

import com.visnis.in.request.PermissionRequest;
import com.visnis.in.response.Response;

public interface IUserPemissionService {

	ResponseEntity<Response> addPemissions(PermissionRequest request);

	ResponseEntity<Response> getPemissionsByDepartmentId(Long departmentId);

}
