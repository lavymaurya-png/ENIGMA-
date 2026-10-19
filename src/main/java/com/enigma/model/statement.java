package com.enigma.model;

public class Statement {

    private String speaker;
    private String statementText;
    private boolean suspicious;
    private int importanceLevel;

    // Constructor
    public Statement(String speaker, String statementText,
                     boolean suspicious, int importanceLevel) {

        this.speaker = speaker;
        this.statementText = statementText;
        this.suspicious = suspicious;
        this.importanceLevel = importanceLevel;
    }

    // Get speaker
    public String getSpeaker() {
        return speaker;
    }

    // Get statement text
    public String getStatementText() {
        return statementText;
    }

    // Check if statement is suspicious
    public boolean isSuspicious() {
        return suspicious;
    }

    // Get importance level
    public int getImportanceLevel() {
        return importanceLevel;
    }

    // Set speaker
    public void setSpeaker(String speaker) {
        this.speaker = speaker;
    }

    // Set statement text
    public void setStatementText(String statementText) {
        this.statementText = statementText;
    }

    // Set suspicious status
    public void setSuspicious(boolean suspicious) {
        this.suspicious = suspicious;
    }

    // Set importance level
    public void setImportanceLevel(int importanceLevel) {
        this.importanceLevel = importanceLevel;
    }

    // Display statement
    public void displayStatement() {

        System.out.println("===== STATEMENT =====");
        System.out.println("Speaker: " + speaker);
        System.out.println("Statement: " + statementText);
        System.out.println("Suspicious: " + suspicious);
        System.out.println("Importance Level: " + importanceLevel);
    }
}
