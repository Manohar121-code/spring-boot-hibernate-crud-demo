package com.howtodoinjava.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "continent")
public class Continent {
	
	@Id
	@Column(name = "continent_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int continent_id;
	
	@Column(name = "continent_name")
	private String continent_name;
	
	public Continent() {
		
	}
	
	public Continent(int continent_id, String continent_name) {
		super();
		this.continent_id = continent_id;
		this.continent_name = continent_name;
	}

	public int getContinent_id() {
		return continent_id;
	}

	public void setContinent_id(int continent_id) {
		this.continent_id = continent_id;
	}

	public String getContinent_name() {
		return continent_name;
	}

	public void setContinent_name(String continent_name) {
		this.continent_name = continent_name;
	}
	
	
}
