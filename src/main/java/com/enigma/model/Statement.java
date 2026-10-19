package com.enigma.model;

public class Statement {
    private String speaker;
    private String statementText;
    private boolean suspicious;
    private int importanceLevel;

    public Statement(String speaker, String statementText,
                     boolean suspicious, int importanceLevel) {
        this.speaker = speaker;
        this.statementText = statementText;
        this.suspicious = suspicious;
        this.importanceLevel = importanceLevel;
    }

    public String getSpeaker() {
        return speaker;
    }

    public String getStatementText() {
        return statementText;
    }

    public boolean isSuspicious() {
        return suspicious;
    }

    public int getImportanceLevel() {
        return importanceLevel;
    }

    public void setSpeaker(String speaker) {
        this.speaker = speaker;
    }

    public void setStatementText(String statementText) {
        this.statementText = statementText;
    }

    public void setSuspicious(boolean suspicious) {
        this.suspicious = suspicious;
    }

    public void setImportanceLevel(int importanceLevel) {
        this.importanceLevel = importanceLevel;
    }
}