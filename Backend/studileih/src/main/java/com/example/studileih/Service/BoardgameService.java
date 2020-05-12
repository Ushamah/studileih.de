package com.example.studileih.Service;

import com.example.studileih.Entity.Product.Boardgame;

import java.util.List;
import java.util.Optional;

public interface BoardgameService {

    List<Boardgame> listAllBoardgame();

    void saveOrUpdateBoardgame(Boardgame boardgame);

    Optional<Boardgame> getBoardgameById(Long id);

    void deleteBoardgame(Long id);
}
