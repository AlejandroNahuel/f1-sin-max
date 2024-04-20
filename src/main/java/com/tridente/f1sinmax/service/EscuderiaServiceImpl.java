package com.tridente.f1sinmax.service;

import com.tridente.f1sinmax.dao.EscuderiaDAO;
import com.tridente.f1sinmax.model.Escuderia;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

public class EscuderiaServiceImpl implements EscuderiaService{

    @Autowired
    EscuderiaDAO escuderiaDAO;
    
    @Override
    @Transactional(readOnly = true)
    public List<Escuderia> getAllEscuderias() {
        return escuderiaDAO.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Escuderia getEscuderiaById(int id) {
        return escuderiaDAO.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public void addEscuderia(Escuderia escuderia) {
        escuderiaDAO.save(escuderia);
    }

    @Override
    @Transactional
    public void updateEscuderia(int id, Escuderia escuderia) {
        if(escuderiaDAO.existsById(id)){
            escuderia.setId(id);
            escuderiaDAO.save(escuderia);
        }
    }

    @Override
    @Transactional
    public void deleteEscuderia(int id) {
        escuderiaDAO.deleteById(id);
    }
    
}
