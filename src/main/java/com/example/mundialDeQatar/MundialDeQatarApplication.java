package com.example.mundialDeQatar;

import com.example.mundialDeQatar.models.Country;
import com.example.mundialDeQatar.models.Player;
import com.example.mundialDeQatar.repositories.CountryRepository;
import com.example.mundialDeQatar.repositories.PlayerRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MundialDeQatarApplication {

	public static void main(String[] args) {
		SpringApplication.run(MundialDeQatarApplication.class, args);
	}

	@Bean
	public CommandLineRunner initData(CountryRepository countryRepository, PlayerRepository playerRepository){
		return (args) ->{
			Country argentina = new Country("Argentina");
			countryRepository.save(argentina);
			Player messi = new Player("lionel", "messi", "Argentina", "PSG", "Delantero", 35, 1.70, 72.00, argentina);
			playerRepository.save(messi);

		};
	}

}
