package com.example.project.user.service;

import com.example.project.user.domain.dto.UserCreateRequest;
import com.example.project.user.domain.entity.UserDTO;

public interface UsersService {
    UserDTO createUser(UserCreateRequest userCreateRequest);
}