package com.espn.sports.persistence.motorsports;

import com.espn.sports.persistence.Competitor;

public interface RacingCompetitor extends Competitor {
	
	public Car getCar();

	public void setCar(Car car);

	public int getNumberCars();

	public void setNumberCars(int numberCars);
	
}
