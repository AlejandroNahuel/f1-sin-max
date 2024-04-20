package com.tridente.f1sinmax.service;

import com.tridente.f1sinmax.model.Piloto;
import java.util.List;

public interface PilotoService {
    
    public List<Piloto> getAllPilotos();
    public Piloto getPilotoById(int id);
    public void addPiloto(Piloto piloto);
    public void updatePiloto(int id, Piloto piloto);
    public void deletePiloto(int id);
}
