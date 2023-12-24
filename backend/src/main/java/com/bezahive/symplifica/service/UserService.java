package com.bezahive.symplifica.service;

import com.bezahive.symplifica.model.User;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public interface UserService {
    public User addUser(User user);
    public User getUserById(long id);
    public List<User> getUsers();
    public void deleteUser(long id);
    public User updateUser(User user);
    User findUserByEmail (String email);

}
