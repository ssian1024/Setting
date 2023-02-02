package com.example.project.user.domain.entity;

import com.example.project.user.enumeration.UserRole;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
public class UserDTO {

    private Long id;

    private String userId;

    private String password;

    private String nickname;

    private UserRole userRole;

    @Builder
    private UserDTO(Long id, String password, UserRole userRole, String userId) {
        this.id = id;
        this.password = password;
        this.userRole = userRole;
        this.userId = userId;
    }

}
