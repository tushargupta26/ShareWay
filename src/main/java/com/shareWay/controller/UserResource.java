package com.shareWay.controller;

import com.shareWay.model.User;
import com.shareWay.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserResource {

    private final UserService userService;

    public UserResource(UserService userService) {
        this.userService = userService;
    }

    //Create
    @PostMapping("/add")
    public User addUser(@RequestBody User user) {
        return userService.addUser(user);
    }

    @GetMapping("/all")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    //Read
    @GetMapping(value = "/{id:[\\d]+}")
    public Optional<User> getUser(@PathVariable Long id) {
        return userService.getUser(id);
    }

    //Update
    @PutMapping(value = "/{id:[\\d]+}")
    public User updateUser(@PathVariable Long id, @RequestBody User userDetails) {
        return userService.updateUser(id, userDetails);
    }

    //Delete
    @DeleteMapping(value = "/{id:[\\d]+}")
    public void deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
    }
}