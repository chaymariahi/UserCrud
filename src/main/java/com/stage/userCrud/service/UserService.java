package com.stage.userCrud.service;

import com.stage.userCrud.model.User;
import org.apache.catalina.LifecycleState;

import java.util.List;

public interface UserService {
    List<User> FindAll();

    User save(User user);
    User findById(long id);

    void deleteUser(Long id);
}
