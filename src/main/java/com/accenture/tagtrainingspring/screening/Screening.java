package com.accenture.tagtrainingspring.screening;

public class Screening {

    String screeningId;
    String patientId;
    String date;
    boolean malignant;

    public Screening(String screeningId, String patientId, String date, boolean malignant) {
        this.screeningId = screeningId;
        this.patientId = patientId;
        this.date = date;
        this.malignant = malignant;
    }

    public void setScreeningId(String screeningId) {
        this.screeningId = screeningId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setMalignant(boolean malignant) {
        this.malignant = malignant;
    }

    public String getScreeningId() {
        return screeningId;
    }

    public String getPatientId() {
        return patientId;
    }

    public String getDate() {
        return date;
    }

    public boolean isMalignant() {
        return malignant;
    }


}
