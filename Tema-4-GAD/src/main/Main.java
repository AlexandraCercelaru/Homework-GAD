package main;

import java.io.*;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        String fileName = "biathlonAthletes.csv";
        InputStream is = null;
        try {
            is = new FileInputStream(fileName);
            AthleteReader reader = new AthleteReader();
            List<Athlete> athletes = reader.readAthletes(new FileReader(fileName));
            athletes.forEach(System.out::println);
            Collections.sort(athletes, new ComparatorResults());
            System.out.println("\nThe order is:");
            System.out.println("WINNER: " + athletes.get(0).getAthleteName() + " cu un timp total de: " + athletes.get(0).getResultInMins() );
            System.out.println("RUNNER-UP: " + athletes.get(1).getAthleteName() + " cu un timp total de: " + athletes.get(1).getResultInMins() );
            System.out.println("THIRD PLACE: " + athletes.get(2).getAthleteName() + " cu un timp total de: " + athletes.get(2).getResultInMins() );
        } finally {
            if (is != null) {
                is.close();
            }
        }
    }
}