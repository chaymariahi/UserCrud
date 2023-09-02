package com.stage.usercrud.service;

import com.stage.usercrud.model.User;

import java.util.List;

public interface UserService {
    List<User> findAll();

    User save(User user);
    User findById(long id);

    void deleteUser(Long id);
}
