package com.espn.sports.persistence.motorsports;

import com.espn.sports.persistence.EntityBase;

public interface Manufacturer extends EntityBase {
	
	public Integer getManufacturerId();

	public void setManufacturerId(int manufacturerId);

	public String getName();

	public void setName(String name);

}
