package com.example.demo2;

import com.example.demo2.domain.student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface studentRepo extends JpaRepository<student, Long> {
}
