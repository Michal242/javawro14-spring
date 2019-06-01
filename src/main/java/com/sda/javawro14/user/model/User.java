package com.sda.javawro14.user.model;

import java.util.Date;

public class User {

    private long id;
    private String name;
    private Date dateOfBirth;

    private static long idCounter = 0;

    public User(String name, Date dateOfBirth) {
        this.id = idCounter;
        idCounter++;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
