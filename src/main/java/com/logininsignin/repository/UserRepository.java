package com.logininsignin.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.logininsignin.entity.User;
import com.logininsignin.entity.UserDTO;
@Repository
public interface UserRepository  extends JpaRepository<User, Integer>{

	

	

	User findByEmail(String email);

	Object findByemailAndPassword(String anyString, String anyString2);
	
	  List<User> findAll();
	

	

	//User findByEmail(String email);
		//@Query("SELECT u.id, u.username,u.email,u.phno,u.password FROM users u WHERE u.email = ?1")
	   // public User findByEmail(String email);

		//public User findByPhno(String phno);

		
	     
	}
		
		



