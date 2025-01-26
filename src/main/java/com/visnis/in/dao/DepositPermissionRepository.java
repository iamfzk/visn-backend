package com.visnis.in.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.visnis.in.entity.DepositPermission;

public interface DepositPermissionRepository extends JpaRepository<DepositPermission, Long> {

	List<DepositPermission> findAllByDepartmentId(Long departmentId);

}
