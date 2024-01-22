package com.logininsignin.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.logininsignin.entity.User;
import com.logininsignin.entity.UserDTO;
import com.logininsignin.repository.UserRepository;
import com.logininsignin.service.UserService;
import com.logininsignin.user.Status;

import java.util.List;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	
	@CrossOrigin()
	@PostMapping("/register")
    public ResponseEntity<UserDTO> registerUser(@RequestBody UserDTO userDTO) {
        try {
            UserDTO registeredUser = userService.registerUser(userDTO);
            return new ResponseEntity<>(registeredUser, HttpStatus.CREATED);
        } catch (Exception e) {
            // Handle registration failure, e.g., duplicate username or other validation errors
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

	
	    @CrossOrigin()
	    @PostMapping(path = "/login",produces = {MediaType.APPLICATION_JSON_VALUE})
	    	  public ResponseEntity<?> loginUser(@Valid @RequestBody UserDTO userDTO) {
	    	
	    	
	    	UserDTO loggedInUser = userService.loginUser(userDTO);
	       
	    
	    	 if (loggedInUser != null) {
	    	            return ResponseEntity.ok(loggedInUser);
	    	        } else {
	    	           return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(null);
	    	        }
	          
	      }

    
 	    

	    
	    
	    
	   
	    


	    @CrossOrigin()
	    @PostMapping("/users/logout")
	    public Status logUserOut(@Valid @RequestBody UserDTO userDTO) {
	      
	    	Status status  = userService.logUserOut(userDTO);

	        return Status.GONE;
	    }

	    @CrossOrigin()
	    @DeleteMapping("/users/all")
	    public Status deleteUsers() {
	        return userService.deleteUsers();
	    }
	}


