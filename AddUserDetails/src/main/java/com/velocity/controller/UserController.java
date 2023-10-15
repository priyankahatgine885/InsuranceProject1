package com.velocity.controller;
import com.velocity.dto.UserResponse;
import com.velocity.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.velocity.service.UserService;

@RestController
public class UserController {
	@Autowired
private UserService userService;

	@PostMapping("/addUserDetails")
	public ResponseEntity<UserResponse> addUserDetails(@RequestBody User user) {
		UserResponse response = this.userService.addUserDetails(user);
		response.setMessage("User created successfully");
		final HttpStatus statusCode = response.getSuccess() ? HttpStatus.OK : HttpStatus.BAD_REQUEST;
		return new ResponseEntity<>(response, statusCode);
	}
}
