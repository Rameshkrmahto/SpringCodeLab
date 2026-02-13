package com.nit.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PlayerService {
	
	@Autowired
	private PlayerClass player;
	
	public void displayPlayerInfo()
	{
		System.out.println("Palyer Id: "+player.getPlayerId());
		System.out.println("Palyer Name: "+player.getPlayerName());
		System.out.println("Palyer Years Number: "+player.getYearsNumber());
		System.out.println("Team Name: "+player.getTeamName());
	}

}
