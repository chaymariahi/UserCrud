package com.stage.usercrud.service;


import com.stage.usercrud.model.User;
import com.stage.usercrud.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserRepository userRepository;
    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User save(User user) {
        userRepository.save(user);
        return user;
    }

    public User findById(long id) {
        Optional<User> userOptional = userRepository.findById(id);
        return userOptional.orElse(null); // Ou gérer le cas où l'utilisateur n'est pas trouvé
    }


    @Override
    public void deleteUser(Long id) {
        User user = findById(id);
        userRepository.delete(user);
    }
}
