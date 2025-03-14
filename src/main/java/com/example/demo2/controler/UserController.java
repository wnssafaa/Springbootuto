package com.example.demo2.controler;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class UserController {
    @GetMapping
    public String bonjour(){
        return "bonjour";
    }
    @GetMapping("/user{name}")
    public String bonjour(@RequestParam String name){
        return "bonjour "+ name;
    }
//    @GetMapping("/user{name}")
//    public String bonjour1(@PathVariable String name){
//        return "bonjour "+ name;
//    }http://localhost:8080/api/usersafaa
@PostMapping("/create")
public String createUser(@RequestBody student s) {
    return "student created" +s;
}
    @PostMapping("/create/admin")
    public String createamin(@RequestBody student s) {
        s.setRole("admin");
        return "admin created" +s;
    }
}
