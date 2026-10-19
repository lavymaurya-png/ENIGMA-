package com.enigma.service;

import com.enigma.model.Detective;

public class ScoreService {

    // Points for collecting a useful clue
    public void awardCluePoints(Detective detective) {
        detective.addScore(10);
        System.out.println("+10 points for discovering a clue!");
    }

    // Points for collecting important evidence
    public void awardEvidencePoints(Detective detective) {
        detective.addScore(20);
        System.out.println("+20 points for collecting evidence!");
    }

    // Points for successful interrogation
    public void awardInterrogationPoints(Detective detective) {
        detective.addScore(15);
        System.out.println("+15 points for completing an interrogation!");
    }

    // Bonus for correct deduction
    public void awardCorrectDeduction(Detective detective) {
        detective.addScore(50);
        System.out.println("+50 points for making the correct deduction!");
    }

    // Penalty for wrong deduction
    public void deductPoints(Detective detective, int points) {
        detective.addScore(-points);
        System.out.println("-" + points + " points!");
    }

    // Get current score
    public int getScore(Detective detective) {
        return detective.getScore();
    }

    // Display score
    public void displayScore(Detective detective) {
        System.out.println("\n===== DETECTIVE SCORE =====");
        System.out.println("Detective: " + detective.getName());
        System.out.println("Current Score: " + detective.getScore());
    }
}
