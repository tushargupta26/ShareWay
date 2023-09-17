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
public class ShareWayResource {

    private final UserResource userResource;
    private final JourneyResource journeyResource;

    @Autowired
    public ShareWayResource(UserResource userResource, JourneyResource journeyResource){
        this.userResource = userResource;
        this.journeyResource = journeyResource;
    }

    @GetMapping(value = "/test", produces = MediaType.APPLICATION_JSON_VALUE)
    public String testController() {
        return "test";
    }
}
