package com.jonathan.booksaw.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jonathan.booksaw.domain.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
