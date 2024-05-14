package com.uam.jaguarcare.modelo;

import java.util.*;

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

    private String telefono;


    @OneToMany(fetch = FetchType.LAZY,mappedBy = "visitante",cascade = CascadeType.ALL)
    List<Visita> visitas;

}