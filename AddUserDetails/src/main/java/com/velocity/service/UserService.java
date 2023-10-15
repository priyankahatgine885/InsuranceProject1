package com.velocity.service;


import com.velocity.dto.UserResponse;
import com.velocity.model.User;

public interface UserService {
  UserResponse addUserDetails(User user);
}
