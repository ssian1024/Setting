package com.example.project.user.service.impl;

import com.example.project.user.domain.entity.Users;
import com.example.project.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@RequiredArgsConstructor
@Service
class UserDetailsServiceImpl implements UserDetailsService {

    private final UserRepository userRepository;

    @Override
    public Users loadUserByUsername(String userEmail) {
        return Optional.ofNullable(userRepository.findByUserId(userEmail)).orElseThrow(() -> new BadCredentialsException("이메일 주소를 확인해주세요."));
    }

}
