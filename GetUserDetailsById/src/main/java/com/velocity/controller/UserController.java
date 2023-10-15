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

	@GetMapping("/getUserById/{id}")
	public ResponseEntity<User> getUserById(@PathVariable int id) {
		User user = userService.getUserById(id);
		return new ResponseEntity<>(user, HttpStatus.OK);
	}
}
