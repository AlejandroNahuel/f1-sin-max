package com.tridente.f1sinmax.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "pilotos")
public class Piloto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_piloto")
    private int id;
    
    @Column(name = "nombre")
    private String nombre;
    
    @Column(name = "escuderia")
    private String escuderia;
    
    @Column(name = "numero")
    private String numero;
    
    @Column(name = "puntos")
    private int puntos;
    
}
