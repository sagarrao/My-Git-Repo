package com.espn.sports.persistence.motorsports;

import com.espn.sports.persistence.EntityBase;

public interface Tyre extends EntityBase {
	
	public Integer getTyreId();

	public void setTyreId(Integer TyreId);

	public String getName();

	public void setName(String name);

}
