package com.howtodoinjava.demo.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.howtodoinjava.demo.model.Continent;
import com.howtodoinjava.demo.model.Country;
import com.howtodoinjava.demo.model.State;
import com.howtodoinjava.demo.service.GeographyService;

@RestController
@RequestMapping("/geography")
public class GeographyController {
	@Autowired
	private GeographyService geographyService;

	@GetMapping("/continents")
	public ResponseEntity<List<Continent>> getContinents() {
		
		List<Continent> continentList = geographyService.getContinents();
		
		return new ResponseEntity<List<Continent>>(continentList, new HttpHeaders(), HttpStatus.OK);
	}

	@GetMapping("/countries/{continentId}")
	public ResponseEntity<List<Country>> getCountriesByContinentId(@PathVariable("continentId") Integer continentId) {
		
		List<Country> countryList = geographyService.getCountriesByContinentId(continentId);
		
		return new ResponseEntity<List<Country>>(countryList, new HttpHeaders(), HttpStatus.OK);
	}

	@GetMapping("/states/{countryId}")
	public ResponseEntity<List<State>> getStatesBycountryId(@PathVariable("countryId") Integer countryId) {
		
		List<State> stateList = geographyService.getStatesBycountryId(countryId);
		
		return new ResponseEntity<List<State>>(stateList, new HttpHeaders(), HttpStatus.OK);
	}

}