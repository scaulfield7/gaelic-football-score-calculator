package com.scaulfield7.gaelicfootballscorecalculator.model;

public class Score {
    private int goals;
    private int points;
    private int totalScore;

    public Score() {
        // Empty constructor needed for JPA
    }

    public Score(int goals, int points) {
        this.goals = goals;
        this.points = points;
        this.totalScore = (goals * 3) + points;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getTotalScore() {
        return this.totalScore;
    }
}
