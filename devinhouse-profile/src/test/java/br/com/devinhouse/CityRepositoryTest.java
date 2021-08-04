package br.com.devinhouse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;

import br.com.devinhouse.model.City;
import br.com.devinhouse.repository.CityRepository;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;


@ActiveProfiles("test")
@DataJpaTest
public class CityRepositoryTest {

	@Autowired
	private CityRepository repository;

	@Test
	public void should_find_all_customers() {

		Iterable<City> cities = repository.findAll();

		int nOfCities = 12;
		assertThat(cities).hasSize(nOfCities);
	}

	@Test
	public void should_find_with_name_ending_population_less_than() {

		var cities = repository.findByNameEndingWithAndPopulationLessThan("est", 150000);

		assertThat(cities).isNotEmpty();
	}

}