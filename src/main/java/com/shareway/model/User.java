package com.shareway.model;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "userdb")
public class User {
    @Id
    @SequenceGenerator(name = "user_seq_gen", sequenceName = "user_seq", allocationSize = 1)
    @GeneratedValue(generator = "user_seq_gen")
    private Integer userId;
    private String name;
    private Date DOB;
    private String email;
    private String phone;
    private String gender;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDOB() {
        return DOB;
    }

    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
