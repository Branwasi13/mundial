package com.example.mundialDeQatar.dto;

import com.example.mundialDeQatar.models.Country;
import com.example.mundialDeQatar.models.Player;

import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class PlayerDTO {
    private Long id;
    private String name, lastName, nationality, club, position;
    private Integer age;
    private Double height, weight;

    public PlayerDTO(Player player) {
        this.id = player.getId();
        this.name = player.getName();
        this.lastName = player.getLastName();
        this.nationality = player.getNationality();
        this.club = player.getClub();
        this.position = player.getPosition();
        this.age = player.getAge();
        this.height = player.getHeight();
        this.weight = player.getWeight();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getNationality() {
        return nationality;
    }

    public String getClub() {
        return club;
    }

    public String getPosition() {
        return position;
    }

    public Integer getAge() {
        return age;
    }

    public Double getHeight() {
        return height;
    }

    public Double getWeight() {
        return weight;
    }
}
