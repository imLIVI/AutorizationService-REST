package com.netology.hw2_1_autorizationservice;

import jakarta.validation.constraints.NotBlank;

public class Person {
    @NotBlank
    private String user;
    @NotBlank
    private String password;

    public Person() {

    }

    public Person(String user, String password) {
        this.user = user;
        this.password = password;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }
}
