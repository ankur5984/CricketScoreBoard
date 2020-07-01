package com.app.service;

import java.util.List;

import com.app.pojos.Player;

public interface ITeamService {
    List<Player> getPlayersOfTeam();
}