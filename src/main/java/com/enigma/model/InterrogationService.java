package com.enigma.service;

import com.enigma.model.Suspect;

import java.util.Scanner;

public class InterrogationService {

    private Scanner scanner;

    // Constructor
    public InterrogationService() {
        scanner = new Scanner(System.in);
    }

    // Start interrogation
    public void interrogate(Suspect suspect) {

        System.out.println("\n===== INTERROGATION =====");

        System.out.println("Suspect: " + suspect.getName());
        System.out.println("Relationship to Victim: "
                + suspect.getRelationshipToVictim());

        // Question 1
        System.out.println("\nDetective: Where were you when the incident happened?");
        String answer1 = scanner.nextLine();

        System.out.println("Suspect: " + answer1);

        // Question 2
        System.out.println("\nDetective: What was your relationship with the victim?");
        String answer2 = scanner.nextLine();

        System.out.println("Suspect: " + answer2);

        // Question 3
        System.out.println("\nDetective: Did you have any reason to hurt the victim?");
        String answer3 = scanner.nextLine();

        System.out.println("Suspect: " + answer3);

        // Increase suspicion if suspect admits having a reason
        if (answer3.equalsIgnoreCase("yes")) {

            suspect.setSuspicionLevel(
                    suspect.getSuspicionLevel() + 10
            );

            System.out.println("\nSuspicion increased by 10 points.");
        }

        System.out.println("\n===== INTERROGATION COMPLETE =====");

        System.out.println("Current Suspicion Level: "
                + suspect.getSuspicionLevel());
    }

    // Display basic suspect information
    public void showSuspect(Suspect suspect) {

        System.out.println("\n===== SUSPECT INFORMATION =====");

        System.out.println("Name: " + suspect.getName());
        System.out.println("Age: " + suspect.getAge());
        System.out.println("Gender: " + suspect.getGender());
        System.out.println("Motive: " + suspect.getMotive());
        System.out.println("Alibi: " + suspect.getAlibi());
        System.out.println("Relationship to Victim: "
                + suspect.getRelationshipToVictim());
        System.out.println("Suspicion Level: "
                + suspect.getSuspicionLevel());
    }
}
