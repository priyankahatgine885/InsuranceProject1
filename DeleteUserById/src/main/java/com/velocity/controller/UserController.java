package com.velocity.controller;
import com.velocity.dto.UserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.velocity.service.UserService;

@RestController
public class UserController {
	@Autowired
private UserService userService;

	@DeleteMapping("/deleteUserById/{id}")
	public ResponseEntity<UserResponse> deleteUserById(@PathVariable int id) {
		userService.deleteUserById(id);
		UserResponse userResponse = new UserResponse(true);
		userResponse.setMessage("User deleted successfully");
		final HttpStatus statusCode = userResponse.getSuccess() ? HttpStatus.OK : HttpStatus.BAD_REQUEST;
		return new ResponseEntity<>(userResponse, statusCode);
	}
}
