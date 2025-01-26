package com.visnis.in.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.visnis.in.entity.UserPermissions;

public interface UserPermissionsRepository extends JpaRepository<UserPermissions, Long> {

	List<UserPermissions> findAllByDepartmentId(Long departmentId);

}
