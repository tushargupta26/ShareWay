package com.shareWay.controller;

import com.shareWay.model.JourneyDetails;
import com.shareWay.service.JourneyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/journey")
public class JourneyResource {
    private JourneyService journeyService;

    JourneyResource(JourneyService journeyService) {
        this.journeyService = journeyService;
    }

    @PostMapping
    public JourneyDetails addJourney(JourneyDetails journeyDetails){
        return journeyService.addJourney(journeyDetails);
    }

    @GetMapping("/all")
    public List<JourneyDetails> getAllJourneys() {
        return journeyService.getAllJourneys();
    }
}
