package com.accenture.tagtrainingspring.patient;

public class Patient {

    String name;
    String id;
    String dob;
    String gender;

    public Patient(String name, String id, String dob, String gender) {
        this.name = name;
        this.id = id;
        this.dob = dob;
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getDob() {
        return dob;
    }

    public String getGender() {
        return gender;
    }
}
