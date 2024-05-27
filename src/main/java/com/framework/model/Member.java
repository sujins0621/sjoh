package com.framework.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import org.springframework.data.annotation.Id;

@Entity
public class Member {

    @Id
    @GeneratedValue
    private Long id;

    private String email;

    private String name;

    private String password;

    // ...
}