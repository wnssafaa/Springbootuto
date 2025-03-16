package com.example.demo2;

import com.example.demo2.domain.student;
import com.example.demo2.shared.studentDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface studentRepo extends JpaRepository<student, Long>
//LONG CUS ID ET DE TYPE LONG
{

    Optional<student> findByName(@Param("name") String name);
   // List<student> findByRole(String role);
    List<student> findByNameIgnoreCase(String name);
    List<student> findAll();


}
