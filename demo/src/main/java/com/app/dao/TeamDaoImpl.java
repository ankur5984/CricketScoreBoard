package com.app.dao;

import java.util.ArrayList;
import java.util.List;

import com.app.pojos.Player;
import com.app.pojos.Team;

public class TeamDaoImpl implements ITeamDao {

    
    ArrayList<Player> list1 = new ArrayList<Player>();
        Team teamA = new Team(1,350,4,5.4,"win");
    ArrayList<Player> list2 = new ArrayList<Player>();
        Team teamB = new Team(1,350,4,5.4,"win");
    
       
        
    @Override
    public List<Player> getListA() {
        
        list1.add(new Player(1,10,100,teamA));
        list1.add(new Player(2,200,100,teamA));
        list1.add(new Player(3,30,100,teamA));
        list1.add(new Player(4,50,100,teamA));
        list1.add(new Player(5,60,100,teamA));

        return list1;
    }
    @Override
    public List<Player> getListB()
    {
        list2.add(new Player(1,11,100,teamB)); 
        list2.add(new Player(2,22,100,teamB)); 
        list2.add(new Player(3,33,100,teamB)); 
        list2.add(new Player(4,44,100,teamB)); 
        list2.add(new Player(5,55,100,teamB));  
        return list2;
    }
}