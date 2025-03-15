package com.example.demo2.domain;

import jakarta.persistence.*;
import lombok.*;

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
