package com.stage.userCrud.service;


import com.stage.userCrud.model.User;
import com.stage.userCrud.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserRepository userRepository;
    @Override
    public List<User> FindAll() {
        return userRepository.findAll();
    }

    @Override
    public User save(User user) {
        userRepository.save(user);
        return user;
    }

    public User findById(long id){
        if (userRepository.findById(id).isPresent()){
            return userRepository.findById(id).get();
        }
        return null;
    }

    @Override
    public void deleteUser(Long id) {
        User user = findById(id);
        userRepository.delete(user);
    }
}
