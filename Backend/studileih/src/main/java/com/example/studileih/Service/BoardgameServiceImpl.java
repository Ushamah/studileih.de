package com.example.studileih.Service;

import com.example.studileih.Entity.Product.Boardgame;
import com.example.studileih.Repository.BoardgameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BoardgameServiceImpl implements BoardgameService {

    @Autowired
    private BoardgameRepository boardgameRepository;

    @Override
    public void saveOrUpdateBoardgame(Boardgame boardgame) {
        boardgameRepository.save(boardgame);
    }

    @Override
    public Optional<Boardgame> getBoardgameById(Long id) {
        return boardgameRepository.findById(id);
    }

    @Override
    public void deleteBoardgame(Long id) {
        boardgameRepository.deleteById(id);
    }

    @Override
    public List<Boardgame> listAllBoardgame() {
        List<Boardgame> boardgames = new ArrayList<>();
        boardgameRepository.findAll().forEach(boardgames::add);
        return boardgames;
    }
}