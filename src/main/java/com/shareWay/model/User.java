package com.shareWay.model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

// Name, userID, password, gender, DOB, email, phone number, userRating
@Entity
@Table(name = "USERS")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String password;
    private Date dateOfBirth;
    //    private Gender gender;
    private String phoneNumber;
    private double rating;
    private String gender;
    @OneToMany(targetEntity = JourneyDetails.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "user_fk", referencedColumnName = "id")
    private List<JourneyDetails> journeyDetails;

    public List<JourneyDetails> getJourneyDetails() {
        return journeyDetails;
    }

    public void setJourneyDetails(List<JourneyDetails> journeyDetails) {
        this.journeyDetails = journeyDetails;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

}