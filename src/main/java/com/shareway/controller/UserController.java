package com.shareway.controller;

import com.shareway.model.User;
import com.shareway.service.UserDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserDataService userDataService;

    @Autowired
    public UserController(UserDataService userDataService) {
        this.userDataService = userDataService;
    }

    //Create
    @PostMapping("/add")
    public User addUser(@RequestBody User user) {
        return userDataService.addUser(user);
    }

    @GetMapping("/all")
    public List<User> getAllUsers() {
        return userDataService.getAllUsers();
    }

    //Read
    @GetMapping(value = "/{id:[\\d]+}")
    public Optional<User> getUser(@PathVariable Integer id) {
        return userDataService.getUser(id);
    }

    //Update
    @PutMapping(value = "/{id:[\\d]+}")
    public User updateUser(@PathVariable Integer id, @RequestBody User userDetails) {
        return userDataService.updateUser(id, userDetails);
    }

    //Delete
    @DeleteMapping(value = "/{id:[\\d]+}")
    public void deleteUser(@PathVariable Integer id) {
        userDataService.deleteUser(id);
    }
}
