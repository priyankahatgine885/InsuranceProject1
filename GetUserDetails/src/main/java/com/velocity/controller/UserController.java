package com.velocity.controller;
import com.velocity.dto.UserListResponse;
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

	@GetMapping("/getUserDetails")
	public ResponseEntity<UserListResponse> getUserDetails() {
		UserListResponse userList = this.userService.getUserDetails();
		HttpStatus statusCode = userList.getSuccess() ? HttpStatus.OK : HttpStatus.BAD_REQUEST;
		return new ResponseEntity<>(userList, statusCode);
	}
}
