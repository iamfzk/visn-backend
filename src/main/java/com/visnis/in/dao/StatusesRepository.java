package com.visnis.in.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.visnis.in.entity.StatusesPermission;

public interface StatusesRepository extends JpaRepository<StatusesPermission, Long> {

}
