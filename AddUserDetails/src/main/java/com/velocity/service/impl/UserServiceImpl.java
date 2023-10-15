package com.velocity.service.impl;

import com.velocity.dto.UserResponse;
import com.velocity.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.velocity.repository.UserRepository;
import com.velocity.service.UserService;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
	private UserRepository userRepository;
	@Override
	public UserResponse addUserDetails(@RequestBody User user){
			return  new UserResponse(userRepository.save(user));
	}


}
