package com.example.project.user.repository;

import com.example.project.user.domain.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
;

@Repository
public interface UserRepository extends JpaRepository <Users, Long> {
    Users findByUserId(String userId);
}
