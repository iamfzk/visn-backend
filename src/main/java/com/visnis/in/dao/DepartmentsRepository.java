package com.visnis.in.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.visnis.in.entity.DepartmentsEntity;

public interface DepartmentsRepository extends JpaRepository<DepartmentsEntity, Long>{

}
