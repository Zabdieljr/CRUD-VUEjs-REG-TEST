package com.bezahive.symplifica.controller;

import com.bezahive.symplifica.model.User;
import com.bezahive.symplifica.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
public class UserController {
    // service
    @Autowired
    private UserService userService;

    @RequestMapping("/user")
    public String hello_world(){
        return "Symplifica REST API";
    }

    // add/register User
    @PostMapping("/user/add")
    public String addUser(@RequestBody User user){
        userService.addUser(user);
        return "User registered Successfully..";
    }

    // getUserById
    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable("id") long id){
        return userService.getUserById(id);
    }
    @GetMapping("/user/email/{email}")
    public User getUserbyEmail (@PathVariable("email") String  email){
        return userService.findUserByEmail(email);
    }

    // getUsers
    @RequestMapping("/users")
    public List<User> getUsers(){
        return userService.getUsers();
    }

    // updateUser
    @PutMapping("/user")
    public User updateUser(@RequestBody User user){
        return userService.updateUser(user);
    }

    // deleteUserById
    @DeleteMapping("/user/{id}")
    public String deleteUser(@PathVariable("id") long id){
        userService.deleteUser(id);
        return "User Deleted";
    }

}
