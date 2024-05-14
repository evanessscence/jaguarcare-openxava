package com.uam.jaguarcare.modelo;

import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.SequenceGenerator;
import lombok.*;

@Entity
@Getter
@Setter
public class Sintomatologia {

    @SequenceGenerator(
            name = "sintoma_sequence",
            sequenceName = "sintoma_sequence",
            allocationSize = 1,
            initialValue = 1000
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "sintoma_sequence"
    )
    @Id 
    @Hidden
    private Integer Id;
    private String nombre;

 @OneToMany(mappedBy="sintomatologia")
    List<Visita> visitas; }
