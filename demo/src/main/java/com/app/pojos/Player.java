package com.app.pojos;

public class Player {
    
    int PlayerId;
    int score;
    double strikeRate;
    Team team ;

    public Player() {
    }

    public Player(int PlayerId, int score, double strikeRate,Team team) {
        this.PlayerId = PlayerId;
        this.score = score;
        this.strikeRate = strikeRate;
        this.team = team;
    }
    

    public int getPlayerId() {
        return this.PlayerId;
    }

    public void setPlayerId(int PlayerId) {
        this.PlayerId = PlayerId;
    }

    public int getScore() {
        return this.score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public double getStrikeRate() {
        return this.strikeRate;
    }

    public void setStrikeRate(double strikeRate) {
        this.strikeRate = strikeRate;
    }

    

    public Player PlayerId(int PlayerId) {
        this.PlayerId = PlayerId;
        return this;
    }

    public Player score(int score) {
        this.score = score;
        return this;
    }

    public Player strikeRate(double strikeRate) {
        this.strikeRate = strikeRate;
        return this;
    }

    public Player team(Team team) {
        this.team = team;
        return this;
    }

    

    @Override
    public String toString() {
        return "{" +
            " PlayerId='" + getPlayerId() + "'" +
            ", score='" + getScore() + "'" +
            ", strikeRate='" + getStrikeRate() + "'" + 
            "}";
    }

}