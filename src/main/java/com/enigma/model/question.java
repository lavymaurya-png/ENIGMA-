package com.enigma.model;

public class Question {

    private String questionText;
    private String category;
    private int points;

    // Constructor
    public Question(String questionText, String category, int points) {
        this.questionText = questionText;
        this.category = category;
        this.points = points;
    }

    // Get question text
    public String getQuestionText() {
        return questionText;
    }

    // Get question category
    public String getCategory() {
        return category;
    }

    // Get points
    public int getPoints() {
        return points;
    }

    // Set question text
    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    // Set category
    public void setCategory(String category) {
        this.category = category;
    }

    // Set points
    public void setPoints(int points) {
        this.points = points;
    }

    // Display question
    public void displayQuestion() {
        System.out.println("Question: " + questionText);
        System.out.println("Category: " + category);
        System.out.println("Points: " + points);
    }
}
