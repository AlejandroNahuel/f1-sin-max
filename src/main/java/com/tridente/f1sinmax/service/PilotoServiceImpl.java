package com.tridente.f1sinmax.service;

import com.tridente.f1sinmax.dao.PilotoDAO;
import com.tridente.f1sinmax.model.Piloto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

public class PilotoServiceImpl implements PilotoService{

    @Autowired
    public PilotoDAO pilotoDAO;
    
    @Override
    @Transactional(readOnly = true)
    public List<Piloto> getAllPilotos() {
        return pilotoDAO.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Piloto getPilotoById(int id) {
        return pilotoDAO.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public void addPiloto(Piloto piloto) {
        pilotoDAO.save(piloto);
    }

    @Override
    @Transactional
    public void updatePiloto(int id, Piloto piloto) {
        if(pilotoDAO.existsById(id)){
            piloto.setId(id);
            pilotoDAO.save(piloto);
        }
    }

    @Override
    @Transactional
    public void deletePiloto(int id) {
        pilotoDAO.deleteById(id);
    }
    
}
