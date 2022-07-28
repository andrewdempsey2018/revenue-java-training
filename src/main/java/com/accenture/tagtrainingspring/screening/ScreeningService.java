package com.accenture.tagtrainingspring.screening;

import com.accenture.tagtrainingspring.patient.Patient;

public class ScreeningService {


    public ScreeningService() {
    }

    boolean forPatient(Screening s, Patient p) {

        return s.patient.getId() == p.getId();

    }


}
