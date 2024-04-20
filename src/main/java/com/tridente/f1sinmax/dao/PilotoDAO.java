package com.tridente.f1sinmax.dao;

import com.tridente.f1sinmax.model.Piloto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PilotoDAO extends JpaRepository<Piloto, Integer>{
    
}
