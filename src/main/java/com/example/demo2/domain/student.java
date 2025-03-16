package com.example.demo2.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.Period;

@AllArgsConstructor
@Data
@Getter
@Setter
@NoArgsConstructor
@Builder
@Entity
@Table(name = "student")


public class student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String role;
    private LocalDate dob;
    @Transient
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private int age;
    public student(long id, String name, String role, LocalDate dob) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.dob = dob;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public int getAge() {
        if (this.dob == null) {
            return 0; // Ou retournez -1, ou une autre valeur par défaut
        }
        return Period.between(this.dob, LocalDate.now()).getYears();
    }

    public void setAge(int age) {
        this.age=age;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
