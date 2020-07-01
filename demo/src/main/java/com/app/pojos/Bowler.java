package com.app.pojos;

public class Bowler extends Player {
    int NumberOfBalls;

    public Bowler() {
    }

    public Bowler(int NumberOfBalls) {
        this.NumberOfBalls = NumberOfBalls;
    }

    public int getNumberOfBalls() {
        return this.NumberOfBalls;
    }

    public void setNumberOfBalls(int NumberOfBalls) {
        this.NumberOfBalls = NumberOfBalls;
    }

    public Bowler NumberOfBalls(int NumberOfBalls) {
        this.NumberOfBalls = NumberOfBalls;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Bowler)) {
            return false;
        }
        Bowler bowler = (Bowler) o;
        return NumberOfBalls == bowler.NumberOfBalls;
    }

    

    @Override
    public String toString() {
        return "{" +
            " NumberOfBalls='" + getNumberOfBalls() + "'" +
            "}";
    }
    
}