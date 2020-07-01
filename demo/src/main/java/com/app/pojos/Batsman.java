package com.app.pojos;

public class Batsman extends Player {
    double strikRate;
    int NumSingles;


    public Batsman() {
    }

    public Batsman(double strikRate, int NumSingles) {
        this.strikRate = strikRate;
        this.NumSingles = NumSingles;
    }

    public double getStrikRate() {
        return this.strikRate;
    }

    public void setStrikRate(double strikRate) {
        this.strikRate = strikRate;
    }

    public int getNumSingles() {
        return this.NumSingles;
    }

    public void setNumSingles(int NumSingles) {
        this.NumSingles = NumSingles;
    }

    public Batsman strikRate(double strikRate) {
        this.strikRate = strikRate;
        return this;
    }

    public Batsman NumSingles(int NumSingles) {
        this.NumSingles = NumSingles;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Batsman)) {
            return false;
        }
        Batsman batsman = (Batsman) o;
        return strikRate == batsman.strikRate && NumSingles == batsman.NumSingles;
    }

    

    @Override
    public String toString() {
        return "{" +
            " strikRate='" + getStrikRate() + "'" +
            ", NumSingles='" + getNumSingles() + "'" +
            "}";
    }

    
}