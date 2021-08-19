package com.howtodoinjava.demo.service;

import java.util.List;

import com.howtodoinjava.demo.model.Continent;
import com.howtodoinjava.demo.model.Country;
import com.howtodoinjava.demo.model.State;

public interface GeographyService {

	List<Continent> getContinents();

	List<Country> getCountriesByContinentId(Integer continentId);

	List<State> getStatesBycountryId(Integer countryId);

}
