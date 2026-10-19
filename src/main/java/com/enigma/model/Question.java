package com.enigma.model;

public class Question {
    private String questionText;
    private String category;
    private int points;

    public Question(String questionText, String category, int points) {
        this.questionText = questionText;
        this.category = category;
        this.points = points;
    }

    public String getQuestionText() {
        return questionText;
    }

    public String getCategory() {
        return category;
    }

    public int getPoints() {
        return points;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}