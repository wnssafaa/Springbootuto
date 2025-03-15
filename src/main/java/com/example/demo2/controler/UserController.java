package com.example.demo2.controler;

import com.example.demo2.domain.student;
import com.example.demo2.service.studentService;
import com.example.demo2.shared.studentDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class UserController {
    private final studentService studentService;

    public UserController(studentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/add")
    public String creat(@RequestBody studentDTO s) {
        return studentService.creatStudent(s);
    }

    @DeleteMapping("/delete{id}")
    public String delete(@RequestParam long id) {
        return studentService.deleteStudent(id);
    }

    @GetMapping("/all")
    public List<student> allStudent() {
        return studentService.Allstudents();
    }

    @GetMapping("/student/{id}")
    public student studentById(@PathVariable long id) { // @PathVariable
        return studentService.findStudentById(id);
    }

    @PutMapping("/update")
    public String updateStudent(@RequestBody studentDTO s) {
        return studentService.updateStudent(s);
    }

    @GetMapping("/name/{name}")
    public Optional<student> studentByName(@PathVariable String name) {
        return studentService.findByName(name); // Pas besoin de cast ici
    }
/*
//    @GetMapping
//    public String bonjour(){
//        return "bonjour";
//    }
//    @GetMapping("/user{name}")
//    public String bonjour(@RequestParam String name){
//        return "bonjour "+ name;
//    }
//    @GetMapping("/user{name}")
//    public String bonjour1(@PathVariable String name){
//        return "bonjour "+ name;
//    }http://localhost:8080/api/usersafaa
//@PostMapping("/create")
//public String createUser(@RequestBody student s) {
//    return "student created" +s;
//
// //@PostMapping("/create/admin")
////    public String createamin(@RequestBody student s) {
////        s.setRole("admin");
////        return "admin created" +s;
////    }}*/


}
