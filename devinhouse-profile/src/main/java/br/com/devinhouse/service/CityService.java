package br.com.devinhouse.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.devinhouse.model.City;
import br.com.devinhouse.repository.CityRepository;

@Service
public class CityService {
	
	@Autowired
	CityRepository repository;
	
	public Iterable<City> getAllCities(){
		return repository.findAll();
	}

}
