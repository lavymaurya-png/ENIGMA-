package com.enigma;

import com.enigma.model.Detective;
import com.enigma.model.Case;
import com.enigma.model.Suspect;
import com.enigma.model.Victim;
import com.enigma.model.Location;
import com.enigma.model.Clue;

import com.enigma.service.InvestigationService;
import com.enigma.service.InterrogationService;
import com.enigma.service.DeductionService;
import com.enigma.service.ScoreService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 1. WELCOME

        System.out.println("======================================");
        System.out.println("          ENIGMA");
        System.out.println("======================================");

        System.out.println("\nWelcome, Detective.");
        System.out.println("Before starting the investigation,");
        System.out.println("please enter your details.\n");


        // 2. GET DETECTIVE DETAILS FROM USER

        System.out.print("Enter your name: ");
        String detectiveName = scanner.nextLine();

        System.out.print("Enter your age: ");
        int detectiveAge = scanner.nextInt();

        scanner.nextLine(); // consume leftover newline

        System.out.print("Enter your gender: ");
        String detectiveGender = scanner.nextLine();


        // 3. CREATE DETECTIVE OBJECT

        Detective detective = new Detective(
                detectiveName,
                detectiveAge,
                detectiveGender
        );


        // 4. DISPLAY DETECTIVE INFORMATION

        System.out.println("\n======================================");
        System.out.println("       DETECTIVE PROFILE");
        System.out.println("======================================");

        detective.displayDetectiveInfo();


        // 5. CREATE THE CASE

        Case enigmaCase = new Case(
                "011",
                "The Last Broadcast",
                "Producer Han Seo-jun has disappeared from "
                        + "Studio 7 during a three-minute blackout. "
                        + "The detective must investigate the suspects, "
                        + "collect evidence and uncover the truth."
        );


        // 6. CREATE VICTIM / MISSING PERSON

        Victim victim = new Victim(
                "Han Seo-jun",
                38,
                "Male",
                "Unknown",
                "Television Producer",
                "Studio 7",
                "Connected to all four suspects"
        );

        enigmaCase.addVictim(victim);


        // 7. CREATE LOCATIONS

        Location studio = new Location(
                "Studio 7",
                "The locked broadcasting studio where Seo-jun disappeared."
        );

        Location securityRoom = new Location(
                "Security Room",
                "The room containing security footage and access records."
        );

        Location editingRoom = new Location(
                "Editing Room",
                "The room containing old recordings and audio evidence."
        );

        Location archiveRoom = new Location(
                "Archive Room",
                "The room containing the old case files and Yuna's belongings."
        );

        enigmaCase.addLocation(studio);
        enigmaCase.addLocation(securityRoom);
        enigmaCase.addLocation(editingRoom);
        enigmaCase.addLocation(archiveRoom);


        // 8. CREATE SUSPECTS

        Suspect minjae = new Suspect(
                "Kang Min-jae",
                35,
                "Male",
                "Wanted to stop Seo-jun from revealing the old case.",
                "Claims he was in the cafeteria.",
                "Seo-jun's business partner",
                35,
                false
        );

        Suspect sooah = new Suspect(
                "Lee Soo-ah",
                31,
                "Female",
                "Wanted to keep her connection to Yuna secret.",
                "Claims she stayed in her dressing room.",
                "Friend of Yuna",
                40,
                false
        );

        Suspect jihoon = new Suspect(
                "Choi Ji-hoon",
                42,
                "Male",
                "Wanted to prevent the original evidence from exposing him.",
                "Claims he was checking the security system.",
                "Security manager",
                70,
                true
        );

        Suspect nari = new Suspect(
                "Han Na-ri",
                27,
                "Female",
                "Wanted to protect her family and Yuna's secrets.",
                "Claims she was in the station lobby.",
                "Seo-jun's younger sister",
                30,
                false
        );

        enigmaCase.addSuspect(minjae);
        enigmaCase.addSuspect(sooah);
        enigmaCase.addSuspect(jihoon);
        enigmaCase.addSuspect(nari);


        // 9. CREATE SERVICES

        InvestigationService investigationService =
                new InvestigationService();

        InterrogationService interrogationService =
                new InterrogationService();

        DeductionService deductionService =
                new DeductionService();

        ScoreService scoreService =
                new ScoreService();


        // 10. CASE BRIEFING

        System.out.println("\n======================================");
        System.out.println("          CASE BRIEFING");
        System.out.println("======================================");

        System.out.println("\nCase ID: " + enigmaCase.getCaseId());
        System.out.println("Case Title: " + enigmaCase.getTitle());

        System.out.println("\n" + enigmaCase.getDescription());

        System.out.println("\nMissing Person: " + victim.getName());
        System.out.println("Last Seen: " + victim.getLastSeenLocation());

        System.out.println("\nYour objective:");
        System.out.println("1. Investigate the suspects.");
        System.out.println("2. Collect evidence.");
        System.out.println("3. Interrogate suspects.");
        System.out.println("4. Analyse deductions.");
        System.out.println("5. Identify the culprit.");

        // 11. DISPLAY SUSPECTS
        System.out.println("\n======================================");
        System.out.println("             SUSPECTS");
        System.out.println("======================================");

        for (Suspect suspect : enigmaCase.getSuspects()) {

            System.out.println("\nName: " + suspect.getName());
            System.out.println("Role: "
                    + suspect.getRelationshipToVictim());
            System.out.println("Suspicion Level: "
                    + suspect.getSuspicionLevel());
        }


        // 12. DISPLAY LOCATIONS

        System.out.println("\n======================================");
        System.out.println("           LOCATIONS");
        System.out.println("======================================");

        for (Location location : enigmaCase.getLocations()) {

            System.out.println("\n" + location.getName());
            System.out.println(location.getDescription());
        }

        // 13. INVESTIGATION STARTS

        System.out.println("\n======================================");
        System.out.println("       INVESTIGATION STARTED");
        System.out.println("======================================");

        System.out.println("\nDetective "
                + detective.getName()
                + ", the investigation is now in your hands.");


        // 14. FINAL STATUS

        scoreService.displayScore(detective);

        System.out.println("\n======================================");
        System.out.println("        END OF INITIAL SETUP");
        System.out.println("======================================");

        scanner.close();
    }
}
