package com.example.project.user.controller;

import com.example.project.user.PackageDto;
import com.example.project.user.domain.dto.UserCreateRequest;
import com.example.project.user.service.impl.UserServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
class UsersController {

    private final UserServiceImpl usersService;

    @GetMapping
    public PackageDto getPackageDto() {

        PackageDto packageDto = new PackageDto();
        packageDto.setNew(false);

        return packageDto;
    }

    @PostMapping("/signup")
    public void createUser(UserCreateRequest userCreateRequest, HttpServletResponse response) throws IOException {
        usersService.createUser(userCreateRequest);
        response.sendRedirect("/login");
    }

    @GetMapping("/logout")
    public void logoutPage(HttpServletRequest request, HttpServletResponse response) throws IOException {
        new SecurityContextLogoutHandler().logout(request, response, SecurityContextHolder.getContext().getAuthentication());
        response.sendRedirect("/login");
    }


}