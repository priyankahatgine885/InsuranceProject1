package com.velocity.service.impl;

import com.velocity.dto.UserListResponse;
import com.velocity.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.velocity.repository.UserRepository;
import com.velocity.service.UserService;

import java.text.SimpleDateFormat;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
	private UserRepository userRepository;
	@Override
	public UserListResponse getUserDetails() {
		List<User> employeeList = userRepository.findAll();
		return new UserListResponse(employeeList) ;
	}


}
