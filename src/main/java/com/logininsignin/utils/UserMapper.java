package com.logininsignin.utils;

import org.springframework.stereotype.Service;

import com.logininsignin.entity.User;
import com.logininsignin.entity.UserDTO;



@Service
public class UserMapper {
	public UserDTO entityToDTO(User user) {
		UserDTO userDTO = new UserDTO();
		userDTO.setId(user.getId());
		userDTO.setUsername(user.getUsername());
		userDTO.setEmail(user.getEmail());
		userDTO.setPhno(user.getPhno());
		userDTO.setPassword(user.getPassword());
		return userDTO;
	}
	public User DTOToEntity(UserDTO userDTO) {
		User user = new User();
		user.setId(userDTO.getId());
		user.setUsername(userDTO.getUsername());
		user.setEmail(userDTO.getEmail());
		user.setPhno(userDTO.getPhno());
		user.setPassword(userDTO.getPassword());
		return user;
	}
}
