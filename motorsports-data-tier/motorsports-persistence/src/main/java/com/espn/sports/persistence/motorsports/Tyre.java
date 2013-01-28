package com.espn.sports.persistence.motorsports;

import com.espn.sports.persistence.EntityBase;

public interface Tyre extends EntityBase {
	
	public int getTyreId();

	public void setTyreId(int TyreId);

	public String getName();

	public void setName(String name);

}
