package com.accenture.tagtrainingspring.screening;

import com.accenture.tagtrainingspring.patient.Gender;
import com.accenture.tagtrainingspring.patient.Patient;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ScreeningDatabase {

    // create list to hold some screenings
    List<Screening> screenList = new ArrayList<Screening>();

    public ScreeningDatabase() {
        // create some test patients
        Patient p = new Patient("John", 123, LocalDate.of(90, 12, 4), Gender.MALE);
        Patient p2 = new Patient("Mick", 777, LocalDate.of(85, 11, 20), Gender.MALE);
        Patient p3 = new Patient("Steve", 367, LocalDate.of(91, 1, 3), Gender.MALE);
        Patient p4 = new Patient("Mary", 111, LocalDate.of(99, 5, 10), Gender.FEMALE);

        //create some test screenings
        Screening s = new Screening(123, p, LocalDate.of(22, 7, 22), false);
        Screening s2 = new Screening(543, p2, LocalDate.of(23, 7, 22), true);
        Screening s3 = new Screening(876, p3, LocalDate.of(24, 7, 22), false);
        Screening s4 = new Screening(675, p4, LocalDate.of(25, 7, 22), true);

        screenList.add(s);
        screenList.add(s2);
        screenList.add(s3);
        screenList.add(s4);
    }

    public List<Screening> getScreenings() {
        return this.screenList;
    }
}
