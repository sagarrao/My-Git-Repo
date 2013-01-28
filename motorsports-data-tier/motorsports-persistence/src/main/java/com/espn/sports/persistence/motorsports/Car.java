package com.espn.sports.persistence.motorsports;

import com.espn.sports.persistence.EntityBase;
import com.espn.sports.persistence.Team;

public interface Car extends EntityBase {
	
	public int getCarId();

	public void setCarId(int carId);

	public int getCarNumber();

	public void setCarNumber(int carNumber);

	public String getCarName();

	public void setCarName(String carName);

	public Tyre getTyre();

	public void setTyre(Tyre tyre);

	public Engine getEngine();

	public void setEngine(Engine engine);

	public Manufacturer getManufacturer();

	public void setManufacturer(Manufacturer manufacturer);	
	
	public Team getTeam();
	
	public void setTeam(Team team);
	
}
