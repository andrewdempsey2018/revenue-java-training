package com.accenture.tagtrainingspring.screening;

import com.accenture.tagtrainingspring.patient.Patient;

import java.util.List;

public class ScreeningService {

    ScreeningDatabase screeningDatabase;

    public ScreeningService(ScreeningDatabase s) {
        this.screeningDatabase = s;
    }

    public boolean forPatient(Screening s, Patient p) {

        return s.patient.getId() == p.getId();

    }

    public List<Screening> getScreenings() {
        return screeningDatabase.getScreenings();
    }


}
