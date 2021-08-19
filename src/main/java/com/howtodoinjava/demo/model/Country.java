package com.howtodoinjava.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "country")
public class Country {

	@Id
	@Column(name = "country_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int country_id;
	
	@Column(name = "country_name")
	private String country_name;
	
	@Column(name = "continent_id")
	private int continent_id;

	public Country() {
		
	}
	
	public Country(int country_id, String country_name, int continent_id) {
		super();
		this.country_id = country_id;
		this.country_name = country_name;
		this.continent_id = continent_id;
	}

	public int getCountry_id() {
		return country_id;
	}

	public void setCountry_id(int country_id) {
		this.country_id = country_id;
	}

	public String getCountry_name() {
		return country_name;
	}

	public void setCountry_name(String country_name) {
		this.country_name = country_name;
	}

	public int getContinent_id() {
		return continent_id;
	}

	public void setContinent_id(int continent_id) {
		this.continent_id = continent_id;
	}
}
