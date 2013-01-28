package com.espn.sports.persistence.motorsports;

import com.espn.sports.persistence.EntityBase;
import com.espn.sports.persistence.Team;

public interface Car extends EntityBase {
	
	public Integer getCarId();

	public void setCarId(Integer carId);

	public Integer getCarNumber();

	public void setCarNumber(Integer carNumber);

	public String getCarName();

	public void setCarName(String carName);

	public Tyre getTyre();

	public void setTyre(Tyre tyre);

	public Engine getEngine();

	public void setEngine(Engine engine);

	public Manufacturer getManufacturer();

	public void setManufacturer(Manufacturer manufacturer);	
	
	public Team getTeam();
	
	public void setTeam(RacingTeam team);
	
}
