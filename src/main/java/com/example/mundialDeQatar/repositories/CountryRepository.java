package com.example.mundialDeQatar.repositories;

import com.example.mundialDeQatar.models.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository  extends JpaRepository <Country, Long> {

}
