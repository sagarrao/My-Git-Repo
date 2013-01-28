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

import com.espn.sports.persistence.motorsports.Manufacturer;

@Entity
@DiscriminatorValue("100")
@Table(name="Manufacturer")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="discriminator", discriminatorType=DiscriminatorType.INTEGER)
@org.hibernate.annotations.Cache(usage=
    org.hibernate.annotations.CacheConcurrencyStrategy.READ_WRITE)
@org.hibernate.annotations.BatchSize(size=15)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="manufacturer")
@XmlType(name="manufacturer")
public class ManufacturerEntity implements Manufacturer {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	private int    manufacturerId;
	@Column(name="name")
	private String name;
	@Override
	public Object getKey() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setKey(Object object) {
		// TODO Auto-generated method stub

	}

	@Override
	public int getManufacturerId() {
		return manufacturerId;
	}

	@Override
	public void setManufacturerId(int manufacturerId) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub

	}

}
