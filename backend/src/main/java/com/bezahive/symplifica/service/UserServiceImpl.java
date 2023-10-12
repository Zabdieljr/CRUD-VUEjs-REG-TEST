package com.bezahive.symplifica.service;

import com.bezahive.symplifica.model.User;
import com.bezahive.symplifica.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    // repository
    @Autowired
    private UserRepository userRepository;

    @Override
    public User addUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User getUserById(long id) {
        return userRepository.findById(id).get();
    }


    @Override
    public List<User> getUsers() {
        return (List<User>) userRepository.findAll();
    }

    @Override
    public void deleteUser(long id) {
        userRepository.deleteById(id);
    }

    @Override
    public User updateUser(User user) {
        return userRepository.save(user);
    }
}
