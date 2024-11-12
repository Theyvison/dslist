package com.dslist.dslist.repositories;

import com.dslist.dslist.entities.Game;
import com.dslist.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
