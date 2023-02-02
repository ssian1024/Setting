package com.example.project.user.service.impl;

import com.example.project.user.domain.dto.UserCreateRequest;
import com.example.project.user.domain.entity.UserDTO;
import com.example.project.user.domain.entity.Users;
import com.example.project.user.repository.UserRepository;
import com.example.project.user.service.UsersService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UsersService {

    private final UserRepository userRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public UserDTO createUser(UserCreateRequest userCreateRequest) {
        Users users = userRepository.save(
                Users.builder().password(bCryptPasswordEncoder.encode(userCreateRequest.getPassWord())).userId(userCreateRequest.getUserId()).userRole(userCreateRequest.getUserRole()).build());
        return UserDTO.builder().id(users.getId()).password(users.getPassword()).userRole(users.getUserRole()).userId(users.getUserId()).build();
    }
}
