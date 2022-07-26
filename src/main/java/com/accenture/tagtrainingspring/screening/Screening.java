package com.accenture.tagtrainingspring.screening;

import java.time.LocalDate;

public class Screening {

    int screeningId;
    int patientId;
    LocalDate date;
    boolean malignant;

    public Screening(int screeningId, int patientId, LocalDate date, boolean malignant) {
        this.screeningId = screeningId;
        this.patientId = patientId;
        this.date = date;
        this.malignant = malignant;
    }

    public int getScreeningId() {
        return screeningId;
    }

    public void setScreeningId(int screeningId) {
        this.screeningId = screeningId;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
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
