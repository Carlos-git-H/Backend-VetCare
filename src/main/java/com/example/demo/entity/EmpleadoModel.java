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

@Table(name = "empleados")
public class EmpleadoModel{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "idEmpleado")
    private Long idEmpleado;
    private String dni;
    @Column (name = "primerNombre")
    private String primerNombre;
    
    @Column (name = "preNombre")
    private String preNombre;
    
    @Column (name = "primerApellido")
    private String primerApellido;
    
    @Column (name = "segundoApellido")
    private String segundoApellido;

    private String telefono;
    private String ubicacion;
    private String correo;
    private String password;
    private Byte estado;
}
