package com.example.project.user.domain.dto;

import com.example.project.user.enumeration.UserRole;
import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserCreateRequest {

    @NotNull
    private String userId;

    @NotNull
    private String passWord;

    @NotNull
    private String nickname;

    @NotNull
    private UserRole userRole;

}