package com.accenture.tagtrainingspring.screening;

import com.accenture.tagtrainingspring.patient.Patient;

import java.time.LocalDate;

public class Screening {

    int screeningId;
    Patient patient;
    LocalDate date;
    boolean malignant;

    public Screening(int screeningId, Patient patient, LocalDate date, boolean malignant) {
        this.screeningId = screeningId;
        this.patient = patient;
        this.date = date;
        this.malignant = malignant;
    }

    public int getScreeningId() {
        return screeningId;
    }

    public void setScreeningId(int screeningId) {
        this.screeningId = screeningId;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient p) {
        this.patient = p;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public boolean isMalignant() {
        return malignant;
    }

    public void setMalignant(boolean malignant) {
        this.malignant = malignant;
    }
}
