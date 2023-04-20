package com.netology.hw2_1_autorizationservice;

import com.netology.hw2_1_autorizationservice.service.AuthorizationService;

import java.util.List;

public class User {
    private String user;
    private String password;
    private List<AuthorizationService.Authorities> authoritiesList;

    public User(String name, String password, List<AuthorizationService.Authorities> authoritiesList) {
        this.user = name;
        this.password = password;
        this.authoritiesList = authoritiesList;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }

    public List<AuthorizationService.Authorities> getAuthoritiesList() {
        return authoritiesList;
    }
}
