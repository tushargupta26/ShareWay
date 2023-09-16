package com.shareWay.repository;

import com.shareWay.model.JourneyDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JourneyRepository extends JpaRepository<JourneyDetails, Long> {
}