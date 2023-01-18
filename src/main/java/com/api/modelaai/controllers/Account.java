package com.api.modelaai.controllers;

import com.api.modelaai.DTOs.UserDTO;
import com.api.modelaai.models.Users;
import com.api.modelaai.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/account")
public class Account {
    @Autowired
    private UserRepository repository;
    @PostMapping("/create")
    public void create(@RequestBody UserDTO req) {
        repository.save(new Users(req));
    }

    @GetMapping("/all")
    public List<Users> getAllUsers() {
        return  repository.findAll();
    }
}
