package com.shareWay.controller;

import com.shareWay.model.JourneyDetails;
import com.shareWay.model.User;
import com.shareWay.service.JourneyService;
import com.shareWay.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/shareWay")
@ResponseBody
public class ShareWayResource {

    private final UserService userService;
    private final JourneyService journeyService;

    @Autowired
    public ShareWayResource(UserService userService, JourneyService journeyService){
        this.userService = userService;
        this.journeyService = journeyService;
    }
    @GetMapping(value = "/test", produces = MediaType.APPLICATION_JSON_VALUE)
    public String testController() {
        return "test";
    }

    @PostMapping(value = "/user")
    public User addUser(@RequestBody User user){
        return userService.createUser(user);
    }

    @GetMapping(value = "/allUsers")
    public List<User> allUsers(){
        return userService.getAllUsers();
    }

    @PostMapping(value = "/journey")
    public JourneyDetails addJourney(JourneyDetails journeyDetails){
        return journeyService.addJourney(journeyDetails);
    }
}
