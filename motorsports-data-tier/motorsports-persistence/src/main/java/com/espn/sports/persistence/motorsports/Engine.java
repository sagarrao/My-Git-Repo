package com.espn.sports.persistence.motorsports;

import com.espn.sports.persistence.EntityBase;

public interface Engine extends EntityBase {
	
	public Integer getEngineId();

	public void setEngineId(Integer engineID);
	
	public String getName();

	public void setName(String name);
	

}
