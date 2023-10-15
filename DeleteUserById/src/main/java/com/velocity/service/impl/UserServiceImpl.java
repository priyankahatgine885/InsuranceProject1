package com.velocity.service.impl;

import com.velocity.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.velocity.repository.UserRepository;
import com.velocity.service.UserService;

import java.text.SimpleDateFormat;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
	private UserRepository userRepository;
	@Override
	public void deleteUserById(int id){
		User entity =userRepository.getOne(id);
		userRepository.delete(entity);
	}

}
