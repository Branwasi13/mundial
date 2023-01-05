package com.example.mundialDeQatar.models;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private Long id;

    private String name;

    @OneToMany(mappedBy="country", fetch=FetchType.EAGER)
    private Set<Player> playerset = new HashSet<>();

    public Country() {
    }

    public Country(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Player> getPlayerset() {
        return playerset;
    }

    public void setPlayerset(Set<Player> playerset) {
        this.playerset = playerset;
    }
}
