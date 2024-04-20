package com.tridente.f1sinmax.model;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "escuderias")
public class Escuderia {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_escuderia")
    private int id;
    
    @Column(name = "nombre")
    private String nombre;
    
    @Column(name = "puntos")
    private int puntos;
    
}
