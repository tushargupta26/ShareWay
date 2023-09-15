package com.shareway.service;

import com.shareway.model.User;
import com.shareway.model.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserDataService {

    private final UserRepository userRepository;

    @Autowired
    public UserDataService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    //Create
    public User addUser(User user) {
        user.setUserId(userRepository.getNextUserID());
        return userRepository.save(user);
    }

    //Read
    public Optional<User> getUser(Integer id) {
        return userRepository.findById(id);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    //Update
    public User updateUser(Integer id, User userBody) {
        Optional<User> user = userRepository.findById(id);
        if (user.isPresent()) {
            User newUser = user.get();
            newUser.setName(userBody.getName());
            newUser.setDOB(userBody.getDOB());
            newUser.setEmail(userBody.getEmail());
            newUser.setPhone(userBody.getPhone());
            newUser.setGender(userBody.getGender());
            return userRepository.save(newUser);
        } else
            return null;
    }

    //Delete
    public void deleteUser(Integer id) {
        Optional<User> user = getUser(id);
        if (user.isPresent()) userRepository.deleteById(id);
    }

}
