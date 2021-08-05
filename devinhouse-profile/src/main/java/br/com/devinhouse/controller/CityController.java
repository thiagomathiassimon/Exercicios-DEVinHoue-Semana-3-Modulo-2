package br.com.devinhouse.controller;

//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import br.com.devinhouse.model.City;
import br.com.devinhouse.service.CityService;

@RestController
@RequestMapping("/v1/city")
public class CityController {

	// private static final Logger logger =
	// LogManager.getLogger(CityController.class);
	private static final Logger logger = LoggerFactory.getLogger(CityController.class);

	@Autowired
	CityService service;

	@GetMapping(produces = APPLICATION_JSON_VALUE)
	@ResponseBody
	public Iterable<City> getAllCities() {
		logger.trace("Realizada chamada ao método service.getAllCities();");
		logger.debug("Realizada chamada ao método service.getAllCities();");
		logger.info("Realizada chamada ao método service.getAllCities();");
		logger.warn("Realizada chamada ao método service.getAllCities();");
		logger.error("Realizada chamada ao método service.getAllCities();");
		return service.getAllCities();
	}

}
