package com.accenture.tagtrainingspring.patient;

import java.time.LocalDate;

public class Patient {

    String name;
    int id;
    LocalDate dateOfBirth;
    Gender gender;

    public Patient(String name, int id, LocalDate dateOfBirth, Gender gender) {
        this.name = name;
        this.id = id;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public Gender getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
