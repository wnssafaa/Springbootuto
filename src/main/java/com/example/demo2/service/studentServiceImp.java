package com.example.demo2.service;

import com.example.demo2.domain.student;
import com.example.demo2.shared.studentDTO;

import java.util.List;
import java.util.Optional;

public interface studentServiceImp {
    String creatStudent(studentDTO s);

    student findStudentById(Long id);
    Optional<student> stydentByName(String name);
    List<student> Allstudents();
    student stydentById(long id);
    studentDTO byRole(String role);
    String updateStudent(studentDTO s);
    String deleteStudent(long id);

}
