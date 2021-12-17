package com.example.demo.Repository;

import com.example.demo.Entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board,Long> { // 주요키로 사용할 객체의 자료형
}
