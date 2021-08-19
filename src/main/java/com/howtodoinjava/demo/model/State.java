package com.howtodoinjava.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "state")
public class State {
	
	@Id
	@Column(name = "state_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int state_id;
	
	@Column(name = "state_name")
	private String state_name;
	
	@Column(name = "country_id")
	private int country_id;

	public State() {
		
	}
	
	public State(int state_id, String state_name, int country_id) {
		super();
		this.state_id = state_id;
		this.state_name = state_name;
		this.country_id = country_id;
	}

	public int getState_id() {
		return state_id;
	}

	public void setState_id(int state_id) {
		this.state_id = state_id;
	}

	public String getState_name() {
		return state_name;
	}

	public void setState_name(String state_name) {
		this.state_name = state_name;
	}

	public int getCountry_id() {
		return country_id;
	}

	public void setCountry_id(int country_id) {
		this.country_id = country_id;
	}

}
