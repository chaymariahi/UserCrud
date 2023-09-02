package com.stage.userCrud.service;

import com.stage.userCrud.model.User;

import java.util.List;

public interface UserService {
    List<User> findAll();

    User save(User user);
    User findById(long id);

    void deleteUser(Long id);
}
