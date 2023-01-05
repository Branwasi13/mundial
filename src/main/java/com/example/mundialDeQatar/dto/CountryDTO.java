package com.example.mundialDeQatar.dto;

import com.example.mundialDeQatar.models.Country;
import com.example.mundialDeQatar.models.Player;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class CountryDTO {
    private Long id;
    private String name;
    private Set<PlayerDTO> players = new HashSet<>();

    public CountryDTO() {
    }

    public CountryDTO(Country country) {
        this.id = country.getId();
        this.name = country.getName();
        this.players = country.getPlayerset().stream().map(player -> new PlayerDTO(player)).collect(Collectors.toSet());
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Set<PlayerDTO> getPlayerset() {
        return players;
    }
}
