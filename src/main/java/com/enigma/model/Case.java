package com.enigma.model;

import java.util.ArrayList;
import java.util.List;

public class Case {

    private String caseId;
    private String title;
    private String description;

    private List<Suspect> suspects;
    private List<Victim> victims;
    private List<Clue> clues;
    private List<Location> locations;

    public Case(String caseId, String title, String description) {
        this.caseId = caseId;
        this.title = title;
        this.description = description;

        suspects = new ArrayList<>();
        victims = new ArrayList<>();
        clues = new ArrayList<>();
        locations = new ArrayList<>();
    }

    public String getCaseId() {
        return caseId;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public List<Suspect> getSuspects() {
        return suspects;
    }

    public List<Victim> getVictims() {
        return victims;
    }

    public List<Clue> getClues() {
        return clues;
    }

    public List<Location> getLocations() {
        return locations;
    }

    public void addSuspect(Suspect suspect) {
        suspects.add(suspect);
    }

    public void addVictim(Victim victim) {
        victims.add(victim);
    }

    public void addClue(Clue clue) {
        clues.add(clue);
    }

    public void addLocation(Location location) {
        locations.add(location);
    }
}