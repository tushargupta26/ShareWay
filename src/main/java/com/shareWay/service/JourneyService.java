package com.shareWay.service;

import com.shareWay.model.JourneyDetails;
import com.shareWay.repository.JourneyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JourneyService {

    private final JourneyRepository journeyRepository;

    @Autowired
    public JourneyService(JourneyRepository journeyRepository) {
        this.journeyRepository = journeyRepository;
    }

    public JourneyDetails addJourney(JourneyDetails journeyDetails) {
        return journeyRepository.save(journeyDetails);
    }

    public List<JourneyDetails> getAllJourneys() {
        return journeyRepository.findAll();
    }
}
