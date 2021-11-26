package com.aweperi.service;

import com.aweperi.model.User;

import java.util.List;
import java.util.Optional;

public interface IUserService {
    List<User> findAll();
    Optional<User> findById(Long id);

    void addUser(User user);
}
