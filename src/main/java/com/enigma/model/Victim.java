package com.enigma.model;

public class Victim extends Person {

    private String causeOfDeath;
    private String occupation;
    private String lastSeenLocation;
    private String relationshipToSuspects;

    public Victim(String name, int age, String gender,
                  String causeOfDeath,
                  String occupation,
                  String lastSeenLocation,
                  String relationshipToSuspects) {

        super(name, age, gender);

        this.causeOfDeath = causeOfDeath;
        this.occupation = occupation;
        this.lastSeenLocation = lastSeenLocation;
        this.relationshipToSuspects = relationshipToSuspects;
    }

    // Getters

    public String getCauseOfDeath() {
        return causeOfDeath;
    }

    public String getOccupation() {
        return occupation;
    }

    public String getLastSeenLocation() {
        return lastSeenLocation;
    }

    public String getRelationshipToSuspects() {
        return relationshipToSuspects;
    }

    // Setters

    public void setCauseOfDeath(String causeOfDeath) {
        this.causeOfDeath = causeOfDeath;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public void setLastSeenLocation(String lastSeenLocation) {
        this.lastSeenLocation = lastSeenLocation;
    }

    public void setRelationshipToSuspects(String relationshipToSuspects) {
        this.relationshipToSuspects = relationshipToSuspects;
    }

    // Display victim information

    public void displayVictimInfo() {
        System.out.println("----- Victim Information -----");
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Gender: " + getGender());
        System.out.println("Cause of Death: " + causeOfDeath);
        System.out.println("Occupation: " + occupation);
        System.out.println("Last Seen Location: " + lastSeenLocation);
        System.out.println("Relationship to Suspects: " + relationshipToSuspects);
    }
}

