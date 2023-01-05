package com.example.mundialDeQatar.repositories;

import com.example.mundialDeQatar.models.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository <Player, Long> {

}
