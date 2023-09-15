package com.shareway.ui;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomePage {
    @GetMapping("/")
    public String openHomePage() {
        return "homepage.html";
    }
}
