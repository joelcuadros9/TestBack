package com.ionix.testback.controller;

import com.ionix.testback.model.User;
import com.ionix.testback.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping
    private List<User> getAllUsers()
    {
        return userService.getAllUsers();
    }

    @PostMapping
    private User saveUser(@RequestBody User user){
        userService.saveUser(user);
        return user;
    }

    @PutMapping
    private User updateUser(@RequestBody User user){
        userService.updateUser(user);
        return user;
    }

    @DeleteMapping("/{id}")
    private void deleteUser(@PathVariable("id") int id){
        userService.deleteUser(id);
    }
}
