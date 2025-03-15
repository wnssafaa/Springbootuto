package com.example.demo2.service;

import com.example.demo2.domain.student;
import com.example.demo2.shared.studentDTO;
import com.example.demo2.studentRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class studentService implements studentServiceImp{
    private final studentRepo repository;

    public studentService(studentRepo repository) {
        this.repository = repository;
    }


    @Override
    public String creatStudent(studentDTO s) {
        student newStudent = new student();
        newStudent.setName(s.getName());
        newStudent.setRole(s.getRole());
        repository.save(newStudent);
        return "Student created successfully!";
    }


    public Optional<student> findByName(String name) {
        return repository.findByName(name);
    }

    @Override
    public student findStudentById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Optional<student> stydentByName(String name) {
        return repository.findByName(name);
    }


    @Override
    public List<student> Allstudents() {
        return repository.findAll();
    }

    @Override
    public student stydentById(long id) {
        return  repository.findById(id).orElse(null);
    }

    @Override
    public studentDTO byRole(String role) {
        return null;
    }

    /**
     * Constructs a new object.
     */


    @Override
    public String deleteStudent(long id) {
        if(repository.existsById(id)){
            repository.deleteById(id);
            return "student suprimer avec succes";
        }else
                 return "student exsit pas";
    }

    @Override
    public String updateStudent(studentDTO s) {
        Optional<student> existingStudent = repository.findById(s.getId());
        if (existingStudent.isPresent()) {
            student updatedStudent = existingStudent.get();
            updatedStudent.setName(s.getName());
            updatedStudent.setRole(s.getRole());
            repository.save(updatedStudent);
            return "Student updated successfully!";
        } else {
            return "Student not found!";
        }
    }
}
