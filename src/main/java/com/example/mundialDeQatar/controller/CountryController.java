package com.example.mundialDeQatar.controller;

import com.example.mundialDeQatar.dto.CountryDTO;
import com.example.mundialDeQatar.repositories.CountryRepository;
import com.example.mundialDeQatar.repositories.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class CountryController {

    @Autowired
    private CountryRepository countryRepository;

    @Autowired
    private PlayerRepository playerRepository;

    @GetMapping("/api/country")
    public List<CountryDTO> getCountry (){
        return countryRepository.findAll().stream().map(CountryDTO::new).collect(Collectors.toList());
    }
}
