package com.app.pojos;

import java.util.List;

public class Team {
    int id;
    int tot_score;
    int wicket;
    String status ;
    double totOver;
    List<Player> list;

    public Team() {
        super();
    }

    public List<Player> addPlayer(Player p)
    {
        if(list.add(p) == false)
           return null;
        return list;

    }

    public Team(int id, int tot_score, int wicket, double overs,String status) {
        this.id = id;
        this.tot_score = tot_score;
        this.wicket = wicket;
        this.totOver = overs;
        this.status = status;
        
    }

    public Team(int id, int tot_score, int wicket, String status,List<Player> list) {
        this.id = id;
        this.tot_score = tot_score;
        this.wicket = wicket;
        this.status = status;
        this.list = list;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTot_score() {
        return this.tot_score;
    }

    public void setTot_score(int tot_score) {
        this.tot_score = tot_score;
    }

    public int getWicket() {
        return this.wicket;
    }

    public void setWicket(int wicket) {
        this.wicket = wicket;
    }

    public String isStatus() {
        return this.status;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    public double getTotOver() {
        return this.totOver;
    }

    public void setTotOver(double totOver) {
        this.totOver = totOver;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", tot_score='" + getTot_score() + "'" +
            ", wicket='" + getWicket() + "'" +
            ", status='" + isStatus() + "'" +
            "}";
    }


}