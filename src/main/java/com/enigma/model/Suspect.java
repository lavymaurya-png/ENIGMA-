package com.enigma.model;

public class Suspect extends Person {

    private String motive;
    private String alibi;
    private String relationshipToVictim;
    private int suspicionLevel;
    private boolean guilty;

    public Suspect(String name, int age, String gender,
                   String motive, String alibi,
                   String relationshipToVictim,
                   int suspicionLevel, boolean guilty) {

        super(name, age, gender);

        this.motive = motive;
        this.alibi = alibi;
        this.relationshipToVictim = relationshipToVictim;
        this.suspicionLevel = suspicionLevel;
        this.guilty = guilty;
    }
    // Getters

    public String getMotive() {
        return motive;
    }

    public String getAlibi() {
        return alibi;
    }

    public String getRelationshipToVictim() {
        return relationshipToVictim;
    }

    public int getSuspicionLevel() {
        return suspicionLevel;
    }

    public boolean isGuilty() {
        return guilty;
    }

    // Setters

    public void setMotive(String motive) {
        this.motive = motive;
    }

    public void setAlibi(String alibi) {
        this.alibi = alibi;
    }

    public void setRelationshipToVictim(String relationshipToVictim) {
        this.relationshipToVictim = relationshipToVictim;
    }

    public void setSuspicionLevel(int suspicionLevel) {
        this.suspicionLevel = suspicionLevel;
    }

    public void setGuilty(boolean guilty) {
        this.guilty = guilty;
    }

    // Display suspect information

    public void displaySuspectInfo() {
        System.out.println("----- Suspect Information -----");
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Gender: " + getGender());
        System.out.println("Motive: " + motive);
        System.out.println("Alibi: " + alibi);
        System.out.println("Relationship to Victim: " + relationshipToVictim);
        System.out.println("Suspicion Level: " + suspicionLevel);
    }
}