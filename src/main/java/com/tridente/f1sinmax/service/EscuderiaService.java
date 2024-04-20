package com.tridente.f1sinmax.service;

import com.tridente.f1sinmax.model.Escuderia;
import java.util.List;

public interface EscuderiaService {
    
    public List<Escuderia> getAllEscuderias();
    public Escuderia getEscuderiaById(int id);
    public void addEscuderia(Escuderia escuderia);
    public void updateEscuderia(int id, Escuderia escuderia);
    public void deleteEscuderia(int id);
}
