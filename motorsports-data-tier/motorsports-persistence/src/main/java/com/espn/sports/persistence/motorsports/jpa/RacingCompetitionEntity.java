package com.espn.sports.persistence.motorsports.jpa;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.espn.sports.persistence.jpa.CompetitionEntity;
import com.espn.sports.persistence.motorsports.RacingCompetition;

@Entity
@DiscriminatorValue("100")
@Table(name="Competition")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="discriminator", discriminatorType=DiscriminatorType.INTEGER)
@org.hibernate.annotations.Cache(usage=
    org.hibernate.annotations.CacheConcurrencyStrategy.READ_WRITE)
@org.hibernate.annotations.BatchSize(size=15)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="racingCompetition")
@XmlType(name="racingCompetition")
public class RacingCompetitionEntity extends CompetitionEntity implements
		RacingCompetition {

	/**
	 * 
	 */
	
	
	private static final long serialVersionUID = 1L;

	public RacingCompetitionEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RacingCompetitionEntity(int id) {
		super(id);
		// TODO Auto-generated constructor stub
	}

	@Column(name="lapDistance")
	private Integer lapDistance;
	
	@Column(name="startLineOffset")
	private Integer startLineOffset;
	
	@Column(name="scheduledLaps")
	private Integer scheduledLaps;
	
	@Column(name="scheduledDistance")
	private Integer scheduledDistance;
	
	@Column(name="carsFrontRow")
	private int     carsFrontRow;
	
	@Override
	public Integer getLapDistance() {
		// TODO Auto-generated method stub
		return lapDistance;
	}

	@Override
	public void setLapDistance(Integer lapDistance) {
		this.lapDistance = lapDistance;

	}

	@Override
	public Integer getStartLineOffset() {
		// TODO Auto-generated method stub
		return startLineOffset;
	}

	@Override
	public void setStartLineOffset(Integer startLineOffset) {
		this.startLineOffset = startLineOffset;

	}

	@Override
	public Integer getScheduledLaps() {
		// TODO Auto-generated method stub
		return scheduledLaps;
	}

	@Override
	public void setScheduledLaps(Integer scheduledLaps) {
		this.scheduledLaps = scheduledLaps;

	}

	@Override
	public Integer getScheduledDistance() {
		// TODO Auto-generated method stub
		return scheduledDistance;
	}

	@Override
	public void setScheduledDistance(Integer scheduledDistance) {
		this.scheduledDistance = scheduledDistance;

	}

	@Override
	public int getCarsFrontRow() {
		// TODO Auto-generated method stub
		return carsFrontRow;
	}

	@Override
	public void setCarsFrontRow(int carsFrontRow) {
		this.carsFrontRow = carsFrontRow;

	}

	@Override
	public void setStartLineOffset() {
		// TODO Auto-generated method stub
		
	}

	

}
