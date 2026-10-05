package com.enigma.service;

import com.enigma.model.Suspect;

import java.util.List;

public class DeductionService {

    // Find the most suspicious suspect
    public Suspect findMostSuspicious(List<Suspect> suspects) {

        if (suspects == null || suspects.isEmpty()) {
            return null;
        }

        Suspect mostSuspicious = suspects.get(0);

        for (Suspect suspect : suspects) {

            if (suspect.getSuspicionLevel()
                    > mostSuspicious.getSuspicionLevel()) {

                mostSuspicious = suspect;
            }
        }

        return mostSuspicious;
    }

    // Display deduction about all suspects
    public void displayDeduction(List<Suspect> suspects) {

        System.out.println("\n===== DEDUCTION =====");

        for (Suspect suspect : suspects) {

            System.out.println(
                    suspect.getName()
                            + " → Suspicion Level: "
                            + suspect.getSuspicionLevel()
            );
        }

        Suspect mostSuspicious = findMostSuspicious(suspects);

        if (mostSuspicious != null) {

            System.out.println("\nMost Suspicious Person: "
                    + mostSuspicious.getName());

            System.out.println(
                    "Suspicion Level: "
                            + mostSuspicious.getSuspicionLevel()
            );
        }
    }

    // Check whether the detective has identified the culprit
    public boolean checkCulprit(Suspect suspect) {

        return suspect != null && suspect.isGuilty();
    }

    // Give a deduction message
    public String getDeductionMessage(Suspect suspect) {

        if (suspect == null) {
            return "No suspect selected.";
        }

        if (suspect.getSuspicionLevel() >= 80) {
            return suspect.getName()
                    + " is