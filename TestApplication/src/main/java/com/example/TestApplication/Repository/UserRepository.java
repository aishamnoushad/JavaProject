package com.example.TestApplication.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.TestApplication.Models.UserEntity;
@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
	
//	User findByUserName(String username);
	UserEntity findByEmail(String email);

}
