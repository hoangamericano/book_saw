package com.jonathan.booksaw.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jonathan.booksaw.domain.User;
import com.jonathan.booksaw.service.UserService;

@RestController
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public ResponseEntity<List<User>> getListUser() {
        List<User> uList = this.userService.handleGetListUser();
        return ResponseEntity.status(HttpStatus.OK).body(uList);
    }

    @PostMapping("/users/create/")
    public ResponseEntity<User> createNewUser(@RequestBody User user) {
        User userCreate = this.userService.handleCreateUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(userCreate);
    }
}
