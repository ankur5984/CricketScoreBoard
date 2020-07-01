package com.app.service;

import java.util.*;

import com.app.dao.ITeamDao;
import com.app.dao.TeamDaoImpl;
import com.app.pojos.Player;
import com.app.pojos.Team;

import org.springframework.beans.factory.annotation.Autowired;

public class TeamServieImpl implements ITeamService {

    @Autowired
    private ITeamDao dao = new TeamDaoImpl();
    
    ArrayList<Player> list = new ArrayList<Player>();
    
    Team teamA = new Team(1,350,4,5.4,"win");
    
    @Override
    public List<Player> getPlayersOfTeam() {
        list.add(new Player(1,10,100,teamA));
        list.add(new Player(2,200,100,teamA));
        list.add(new Player(3,30,100,teamA));
        list.add(new Player(4,50,100,teamA));
        list.add(new Player(5,60,100,teamA));
        return dao.getListA();
    }
    
}