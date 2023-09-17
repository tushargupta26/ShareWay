package com.shareWay.service;

import com.shareWay.model.User;
import com.shareWay.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    //Create
    public User addUser(User user) {
        return userRepository.save(user);
    }

    //Read
    public Optional<User> getUser(Long id) {
        return userRepository.findById(id);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    //Update
    public User updateUser(Long id, User userBody) {
        Optional<User> user = userRepository.findById(id);
        if (user.isPresent()) {
            User newUser = user.get();
            newUser.setName(userBody.getName());
            newUser.setPassword(userBody.getPassword());
            newUser.setDateOfBirth(userBody.getDateOfBirth());
            newUser.setEmail(userBody.getEmail());
            newUser.setPhoneNumber(userBody.getPhoneNumber());
            newUser.setGender(userBody.getGender());
            newUser.setRating(userBody.getRating());
            return userRepository.save(newUser);
        } else
            return null;
    }

    //Delete
    public void deleteUser(Long id) {
        Optional<User> user = getUser(id);
        if (user.isPresent()) userRepository.deleteById(id);
    }

}