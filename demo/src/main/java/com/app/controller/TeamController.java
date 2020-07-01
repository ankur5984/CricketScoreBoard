package com.app.controller;

import java.util.*;

import com.app.pojos.Player;
import com.app.pojos.Team;
import com.app.service.ITeamService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeamController {
    
    @Autowired
    private ITeamService dao;

    ArrayList<Player> list = new ArrayList<Player>();
    
    Team teamA = new Team(1,350,4,5.4,"win");
    
    @GetMapping(value="/hel")
    public String get()
    {
        return "hello";
    }

    @GetMapping(value = "/get")
    @ResponseBody
    public List<Player> retrieve()
    {
        list.add(new Player(1,10,100,teamA));
        list.add(new Player(2,200,100,teamA));
        list.add(new Player(3,30,100,teamA));
        list.add(new Player(4,50,100,teamA));
        list.add(new Player(5,60,100,teamA));
        return dao.getPlayersOfTeam();
    }
}