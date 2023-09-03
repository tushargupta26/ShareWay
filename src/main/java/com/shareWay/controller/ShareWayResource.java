package com.shareWay.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/shareWay")
@ResponseBody
public class ShareWayResource {

    @GetMapping(value = "/test", produces = MediaType.APPLICATION_JSON_VALUE)
    public String testController(){
        return "test";
    }
}
