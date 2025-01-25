package com.visnis.in.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.visnis.in.entity.UserDetails;
@Repository
public interface UserDetailsRepository extends JpaRepository<UserDetails, Long>{

	UserDetails findByPhoneNamber(String phoneNamber);

}
