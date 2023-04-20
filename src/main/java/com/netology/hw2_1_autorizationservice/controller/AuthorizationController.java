package com.netology.hw2_1_autorizationservice.controller;

import com.netology.hw2_1_autorizationservice.Person;
import com.netology.hw2_1_autorizationservice.service.AuthorizationService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AuthorizationController {
    AuthorizationService service;

    public AuthorizationController(AuthorizationService service) {
        this.service = service;
    }

    @GetMapping("/authorize")
    public List<AuthorizationService.Authorities> getAuthorities(@Valid Person person) {
        return service.getAuthorities(person.getUser(), person.getPassword());
    }
}
