package com.logininsignin;



import java.net.http.HttpHeaders;
import java.util.ArrayList;
import java.util.List;

import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import org.mockito.MockitoAnnotations;
import org.springdoc.core.RequestBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;

import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.logininsignin.Controller.UserController;
import com.logininsignin.entity.User;
import com.logininsignin.entity.UserDTO;
import com.logininsignin.repository.UserRepository;
import com.logininsignin.service.UserService;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;




//@RunWith(SpringRunner.class)
@SpringBootTest
class LogininsigninApplicationTests {
	
	
	private MockMvc mockMvc;

    @InjectMocks
    private UserController userController;

    @Mock
    private UserService userService;
    
    @Mock
    private UserRepository userRepository;

    private final ObjectMapper objectMapper = new ObjectMapper();
	
	 
	
	
	/*
	 * @BeforeEach void setUp() { MockitoAnnotations.initMocks(this);
	 * 
	 * 
	 * 
	 * }
	 */

	/**@Test
	public void contextLoads() {
		System.out.println("connected");
		MatcherAssert.assertThat("context loaded successfully", true);
	}
	
	  @Test
	  void testRegisterUser_NewUser() { 
		  
		  User newUser = new User();
			  
			  newUser.setUsername("test"); 
			  
		  
		  newUser.setEmail("test@example.com"); 
		  newUser.setPhno("7890654321");
		  newUser.setPassword("password");
	  
	  User newUser1 = new User();

	  newUser1.setUsername("test1"); 
	  
  
  newUser1.setEmail("test1@example.com"); 
  newUser1.setPhno("7890654567");
  newUser1.setPassword("pass1");
	 List<User> users = new ArrayList<>();
	 
	 users.add(newUser);
	 users.add(newUser1);
	  when(userRepository.findAll()).thenReturn(users);
	  assertEquals(users, users);
	  }**/  
	  
	 /* when(userService.save(newUser)).thenReturn(Status.SAVING);
	 * 
	 * Status status = userController.registerUser(newUser);
	 * 
	 * assertEquals(Status.SAVING, status); verify(userService, times(1)).findAll();
	 * verify(userService, times(1)).save(newUser); }
	 * 
	 * 
	 * @Test void testLoginUser_Success() { User user = new User();
	 * user.setEmail("test@example.com"); user.setPassword("password");
	 * 
	 * User existingUser = new User(); existingUser.setEmail("test@example.com");
	 * existingUser.setPassword("password"); existingUser.setLoggedIn(false);
	 * 
	 * when(userService.findByEmail(user.getEmail())).thenReturn(existingUser);
	 * when(userService.save(existingUser)).thenReturn(true);
	 * 
	 * ResponseEntity<?> response = userController.loginUser(user);
	 * 
	 * assertEquals(HttpStatus.OK, response.getStatusCode());
	 * assertEquals(existingUser, response.getBody()); assertEquals(true,
	 * existingUser.isLoggedIn()); verify(userService,
	 * times(1)).findByEmail(user.getEmail()); verify(userService,
	 * times(1)).save(existingUser); }
	 * 
	 * @Test void testLoginUser_Failure() { User user = new User();
	 * user.setEmail("test@example.com"); user.setPassword("wrong_password");
	 * 
	 * when(userService.findByEmail(user.getEmail())).thenReturn(null);
	 * 
	 * ResponseEntity<?> response = userController.loginUser(user);
	 * 
	 * assertEquals(HttpStatus.UNAUTHORIZED, response.getStatusCode());
	 * assertEquals("Unauthorized access: User not found or login failed.",
	 * response.getBody()); verify(userService,
	 * times(1)).findByEmail(user.getEmail()); }
	 * 
	 * @Test void testLogUserOut() { User user = new User();
	 * user.setEmail("test@example.com"); user.setLoggedIn(true);
	 * 
	 * List<User> users = new ArrayList<>(); users.add(user);
	 * 
	 * when(userService.findAll()).thenReturn(users);
	 * when(userService.save(user)).thenReturn(true);
	 * 
	 * Status status = userController.logUserOut(user);
	 * 
	 * assertEquals(Status.SAVING, status); assertEquals(false, user.isLoggedIn());
	 * verify(userService, times(1)).findAll(); verify(userService,
	 * times(1)).save(user); }
	 * 
	 * @Test void testDeleteUsers() { Status status = userController.deleteUsers();
	 * 
	 * assertEquals(Status.SAVING, status); verify(userService,
	 * times(1)).deleteAll(); }
	 */
	 
	
}
