package com.example.studileih.Repository;

import com.example.studileih.Entity.Product.Boardgame;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardgameRepository extends JpaRepository<Boardgame, Long> {
}
