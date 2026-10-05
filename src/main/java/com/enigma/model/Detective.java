package com.enigma.model;

import java.util.ArrayList;
import java.util.List;

public class Detective extends Person {

    private List<Evidence> collectedEvidence;
    private int score;

    public Detective(String name, int age, String gender) {
        super(name, age, gender);

        collectedEvidence = new ArrayList<>();
        score = 0;
    }

    // Add evidence to detective's collection
    public void collectEvidence(Evidence evidence) {
        collectedEvidence.add(evidence);
    }

    // Get all collected evidence
    public List<Evidence> getCollectedEvidence() {
        return collectedEvidence;
    }

    // Add points to score
    public void addScore(int points) {
        score += points;
    }

    // Get current score
    public int getScore() {
        return score;
    }

    // Display detective information
    public void displayDetectiveInfo() {
        System.out.println("----- Detective Information -----");
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Gender: " + getGender());
        System.out.println("Score: " + score);
        System.out.println("Evidence Collected: " + collectedEvidence.size());
    }
}