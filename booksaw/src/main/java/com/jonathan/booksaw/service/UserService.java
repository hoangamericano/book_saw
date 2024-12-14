package com.jonathan.booksaw.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jonathan.booksaw.domain.User;
import com.jonathan.booksaw.repository.UserRepository;

import jakarta.validation.Valid;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> handleGetListUser() {
        return this.userRepository.findAll();
    }

    public User handleCreateUser(User user) {
        // TODO Auto-generated method stub
        return this.userRepository.save(user);
    }

}
