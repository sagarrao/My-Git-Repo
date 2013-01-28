package com.espn.sports.persistence.motorsports;

import com.espn.sports.persistence.Competition;
public interface RacingCompetition extends Competition {
	
	public Integer getLapDistance();
	
	public void setLapDistance(Integer lapDistance);
	
	public Integer getStartLineOffset();
	
	public void setStartLineOffset();
	
	public Integer getScheduledLaps();
	
	public void setScheduledLaps(Integer scheduledLaps);
	
	public Integer getScheduledDistance();
	
	public void setScheduledDistance(Integer scheduledDistance);
	
	public int getCarsFrontRow();
	
	public void setCarsFrontRow(int carsFrontRow);

	void setStartLineOffset(Integer startLineOffset);

}
