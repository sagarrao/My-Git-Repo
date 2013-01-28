package com.espn.sports.persistence.motorsports;

import com.espn.sports.persistence.Country;
import com.espn.sports.persistence.Team;

public interface RacingTeam extends Team {

	public Boolean isActive();
	public void    setIsActive(Boolean currentTeam);
	
	public Country getCountry();
	public void    setCountry(Country country);
	
	public Boolean currentTeam();
	public void    setCurrentTeam(Boolean currentTeam);
	
	public String  getTeamFounded();
	public void  setTeamFounded(String teamFounded);
	
	public String  getAka();
	public void  setAka(String aka);
	
	public String  getAddress();
	public void  setAddress(String address);
	
	public String  getAchievements();
	public void  setAchievements(String achievements);
	
	public Engine getEngine();
	public void    setEngine(Engine engine);
	
	public Tyre getTyre();
	public void    setTyre(Tyre tyre);
	
	public Manufacturer getManufacturer();
	public void    setManufacturer(Manufacturer manufacturer);
	
	public String  getTeamPrincipal();
	public void  setTeamPrincipal(String teamPrincipal);
	
	public String  getTechnicalDirector();
	public void  setTechnicalDirector(String technicalDirector);
}
