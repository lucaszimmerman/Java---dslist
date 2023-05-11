package com.devsuperior.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dslist.entities.GameList;

//Aula 2 Buscas totais em listas
//1°Camada

public interface GameListRepository extends JpaRepository<GameList, Long>{

}
