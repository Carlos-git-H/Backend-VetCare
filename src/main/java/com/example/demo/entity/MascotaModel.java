package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import jakarta.persistence.GeneratedValue;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "mascotas") 
@Data
@NoArgsConstructor 
@AllArgsConstructor 
public class MascotaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "idMascota")
    private Long idMascota; 

    
    @Column (name = "clienteId")
    private Long clienteId; 

    private String nombre; 

    
    @Column (name = "razaId")
    private Long razaId; 

    private String sexo; //"M" para macho, "F" para hembra

    private Double peso; 

    @Temporal(TemporalType.DATE)
    private Date fechaNac; 

    private String comentario; 

    private Integer estado;  // 1 para activo, 0 para inactivo
}
