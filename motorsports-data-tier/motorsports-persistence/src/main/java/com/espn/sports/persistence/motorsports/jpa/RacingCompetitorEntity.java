package com.espn.sports.persistence.motorsports.jpa;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.IdClass;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.espn.sports.persistence.jpa.CompetitorEntity;
import com.espn.sports.persistence.motorsports.Car;
import com.espn.sports.persistence.motorsports.RacingCompetitor;


@Entity
@DiscriminatorValue("0")
@Table(name="Competitor")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="discriminator", discriminatorType=DiscriminatorType.INTEGER)
@IdClass(CompetitorEntity.Key.class)
@org.hibernate.annotations.Cache(usage=
    org.hibernate.annotations.CacheConcurrencyStrategy.READ_WRITE)
@org.hibernate.annotations.BatchSize(size=15)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="competitor")
@XmlType(name="competitor")
public class RacingCompetitorEntity extends CompetitorEntity implements
		RacingCompetitor {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@ManyToOne(optional=false, fetch=FetchType.EAGER)
    @JoinColumn(name="carId", insertable=false, updatable=false)
    @org.hibernate.annotations.Fetch(org.hibernate.annotations.FetchMode.SELECT)
    @org.hibernate.annotations.Cache(usage=
        org.hibernate.annotations.CacheConcurrencyStrategy.READ_WRITE)
	private Car car;
	
	@Column(name="numberCars")
	private int numberCars;
	
	
	@Override
	public Car getCar() {
		
		return car;
	}

	@Override
	public void setCar(Car car) {
		this.car = car;

	}

	@Override
	public int getNumberCars() {
		return numberCars;
	}

	@Override
	public void setNumberCars(int numberCars) {
		this.numberCars = numberCars;
	}

}
