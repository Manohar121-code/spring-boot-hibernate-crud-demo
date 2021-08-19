package com.howtodoinjava.demo.repository;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.howtodoinjava.demo.model.Continent;
import com.howtodoinjava.demo.model.Country;
import com.howtodoinjava.demo.model.State;

@Repository
public class GeographyDaoImpl implements GeographyDao {
	
	@Autowired
	SessionFactory sessionFactory;

	public List<Continent> getContinents() {
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("from Continent");
		List<Continent> list = query.list();
		return list;
	}

	public List<Country> getCountriesByContinentId(Integer continentId) {
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("from Country where continent_id = :continent_id");
		query.setInteger("continent_id", continentId);
		List<Country> list = query.list();
		return list;
	}

	public List<State> getStatesBycountryId(Integer countryId) {
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("from State where country_id = :country_id");
		query.setInteger("country_id", countryId);
		List<State> list = query.list();
		return list;
	}

}
