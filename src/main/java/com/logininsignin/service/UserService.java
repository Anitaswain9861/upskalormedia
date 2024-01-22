package com.logininsignin.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.logininsignin.entity.User;
import com.logininsignin.entity.UserDTO;
import com.logininsignin.user.Status;







public interface UserService {
	
		

		public UserDTO registerUser(UserDTO userDTO);


		public UserDTO loginUser(UserDTO userDTO);

		public Status logUserOut(UserDTO userDTO);


		void deleteAll();


		Status deleteUsers();



		


		//UserDTO registerUser(UserDTO userDTO);

		//UserDTO loginUser(UserDTO userDTO);

		

		
	

}
