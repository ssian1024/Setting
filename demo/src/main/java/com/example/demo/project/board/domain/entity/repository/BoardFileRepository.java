package com.example.demo.project.board.domain.entity.repository;

import com.example.demo.project.board.domain.entity.BoardFileEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardFileRepository extends JpaRepository<BoardFileEntity, Long> {
}