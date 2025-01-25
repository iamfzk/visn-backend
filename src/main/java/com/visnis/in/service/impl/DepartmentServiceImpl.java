package com.visnis.in.service.impl;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.visnis.in.dao.DepartmentsRepository;
import com.visnis.in.entity.DepartmentsEntity;
import com.visnis.in.request.AddDepartmentRequest;
import com.visnis.in.response.Response;
import com.visnis.in.service.IDepartmentService;

@Service
public class DepartmentServiceImpl implements IDepartmentService {
	@Autowired
	DepartmentsRepository departmentsRepository;

	@Override
	public ResponseEntity<Response> addDepartment(AddDepartmentRequest request) {
		DepartmentsEntity entity = new DepartmentsEntity();
		entity.setDepartmentName(request.getDepartmentName());
		entity.setDepartmentTitle(request.getDepartmentTitle());
		entity.setCreatedDate(LocalDateTime.now());
		DepartmentsEntity save = departmentsRepository.save(entity);
		Response response = new Response();
		if (save != null) {
			response.setMessage("department added successully");
			response.setStatusCode("1");
			return new ResponseEntity<>(response, HttpStatus.OK);
		} else {
			response.setMessage(" failed to add department");
			response.setStatusCode("0");
			return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
