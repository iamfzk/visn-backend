package com.visnis.in.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.visnis.in.entity.UserPermissions;

public interface UserPermissionsRepository extends JpaRepository<UserPermissions, Long> {

}
