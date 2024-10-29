package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "clientes")
public class ClienteModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id_cliente")
    private Long idCliente;
    private String dni;
    @Column (name = "primer_nombre")
    private String primerNombre;
    
    @Column (name = "pre_nombre")
    private String preNombre;
    
    @Column (name = "primer_apellido")
    private String primerApellido;
    
    @Column (name = "segundo_apellido")
    private String segundoApellido;
    private String telefono;
    private String correo;
    private String password;
    private Byte estado;
}
