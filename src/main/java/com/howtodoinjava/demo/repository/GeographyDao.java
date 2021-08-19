package com.howtodoinjava.demo.repository;

import java.util.List;

import com.howtodoinjava.demo.model.Continent;
import com.howtodoinjava.demo.model.Country;
import com.howtodoinjava.demo.model.State;

public interface GeographyDao {

	List<Continent> getContinents();

	List<Country> getCountriesByContinentId(Integer continentId);

	List<State> getStatesBycountryId(Integer countryId);

}
