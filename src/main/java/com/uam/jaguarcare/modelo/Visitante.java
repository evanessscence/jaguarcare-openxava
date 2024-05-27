package com.uam.jaguarcare.modelo;

import javax.persistence.*;

import lombok.*;

@Entity
@Getter
@Setter
public class Visitante {

    @Id
    private String cifID;

    @Column(length=25)
    private String primerNombre;

    @Column(length=25)
    private String primerApellido;

    @Enumerated(EnumType.STRING)
    private Carrera carrera;
    
    @Enumerated(EnumType.STRING)
    private TipoVisitante tipo;

    private String telefono;


}
