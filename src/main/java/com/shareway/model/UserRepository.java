package com.shareway.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User, Integer> {
    @Query(value = "SELECT nextval('user_seq')", nativeQuery = true)
    Integer getNextUserID();
}
