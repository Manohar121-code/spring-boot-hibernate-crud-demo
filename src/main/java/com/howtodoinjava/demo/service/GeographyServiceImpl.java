package com.howtodoinjava.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.howtodoinjava.demo.model.Continent;
import com.howtodoinjava.demo.model.Country;
import com.howtodoinjava.demo.model.State;
import com.howtodoinjava.demo.repository.GeographyDao;

@Service
public class GeographyServiceImpl implements GeographyService {

	@Autowired
	private GeographyDao geographyDao;

	public List<Continent> getContinents() {
		List<Continent> continentList = geographyDao.getContinents();
		return continentList;
	}

	public List<Country> getCountriesByContinentId(Integer continentId) {
		List<Country> countryList = geographyDao.getCountriesByContinentId(continentId);
		return countryList;
	}

	public List<State> getStatesBycountryId(Integer countryId) {
		List<State> stateList = geographyDao.getStatesBycountryId(countryId);
		return stateList;
	}

}
