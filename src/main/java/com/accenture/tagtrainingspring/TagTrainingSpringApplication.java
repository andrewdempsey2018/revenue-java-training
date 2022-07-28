package com.accenture.tagtrainingspring;

import com.accenture.tagtrainingspring.patient.Gender;
import com.accenture.tagtrainingspring.patient.Patient;
import com.accenture.tagtrainingspring.screening.Screening;
import com.accenture.tagtrainingspring.screening.ScreeningService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class TagTrainingSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(TagTrainingSpringApplication.class, args);
		printWelcomeMessage();

		// create some test patients
		Patient p = new Patient("John", 123, LocalDate.of(90,12,4), Gender.MALE);
		Patient p2 = new Patient("Mick", 777, LocalDate.of(85,11,20), Gender.MALE);
		Patient p3 = new Patient("Steve", 367, LocalDate.of(91,1,3), Gender.MALE);
		Patient p4 = new Patient("Mary", 111, LocalDate.of(99,5,10), Gender.FEMALE);

		//create some test screenings
		Screening s = new Screening(456, p, LocalDate.of(22,7,22), false);
		Screening s2 = new Screening(543, p2, LocalDate.of(23,7,22), true);
		Screening s3 = new Screening(876, p3, LocalDate.of(24,7,22), false);
		Screening s4 = new Screening(675, p4, LocalDate.of(25,7,22), true);

		System.out.println(p.getName() + " has a malignant diagnosis of " + s.isMalignant());

		ScreeningService ss = new ScreeningService();

		boolean x = ss.forPatient(s,p2);

		System.out.println(x);

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
