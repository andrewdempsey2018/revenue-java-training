package com.accenture.tagtrainingspring;

import com.accenture.tagtrainingspring.patient.Gender;
import com.accenture.tagtrainingspring.patient.Patient;
import com.accenture.tagtrainingspring.screening.Screening;
import com.accenture.tagtrainingspring.screening.ScreeningDatabase;
import com.accenture.tagtrainingspring.screening.ScreeningService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class TagTrainingSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(TagTrainingSpringApplication.class, args);
        printWelcomeMessage();

        ScreeningDatabase screeningDatabase = new ScreeningDatabase();

        ScreeningService screeningService = new ScreeningService(screeningDatabase);

        // iterate list and output contents
        for (int i = 0; i < screeningService.getScreenings().size(); i++) {

            System.out.println("Screening for patient " + screeningService.getScreenings().get(i).getPatient().getName() + ", returned a malignant result of " + screeningService.getScreenings().get(i).isMalignant());
        }

    }

    private static void printWelcomeMessage() {
        System.out.println("\n" +
                "  _______       _____   _______        _       _             \n" +
                " |__   __|/\\   / ____| |__   __|      (_)     (_)            \n" +
                "    | |  /  \\ | |  __     | |_ __ __ _ _ _ __  _ _ __   __ _ \n" +
                "    | | / /\\ \\| | |_ |    | | '__/ _` | | '_ \\| | '_ \\ / _` |\n" +
                "    | |/ ____ \\ |__| |    | | | | (_| | | | | | | | | | (_| |\n" +
                "    |_/_/    \\_\\_____|    |_|_|  \\__,_|_|_| |_|_|_| |_|\\__, |\n" +
                "                                                        __/ |\n" +
                "                                                       |___/ \n");
    }

}
