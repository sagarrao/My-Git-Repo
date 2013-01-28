package com.espn.sports.persistence.motorsports;

import com.espn.sports.persistence.Country;
import com.espn.sports.persistence.Team;

public interface RacingTeam extends Team {

	public boolean isActive();
	public void    setIsActive();
	
	public Country getCountry();
	public void    setCountry(Country country);
	
	public boolean currentTeam();
	public void    setCurrentTeam(boolean currentTeam);
	
	public String  getTeamFounded();
}
