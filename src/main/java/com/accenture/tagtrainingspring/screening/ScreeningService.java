package com.accenture.tagtrainingspring.screening;

import com.accenture.tagtrainingspring.patient.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScreeningService {

    @Autowired
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

    public Screening getPatientScreening(String patientName) {

        // iterate list and output contents
        for (int i = 0; i < this.screeningDatabase.getScreenings().size(); i++) {

            if (patientName == screeningDatabase.getScreenings().get(i).getPatient().getName()) {
                return screeningDatabase.getScreenings().get(i);
            }
        }
        return null;
    }

}
