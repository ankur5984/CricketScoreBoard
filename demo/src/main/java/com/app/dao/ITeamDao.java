package com.app.dao;

import java.util.List;

import com.app.pojos.Player;

public interface ITeamDao {
    
    List<Player> getListA();
    List<Player> getListB();
}