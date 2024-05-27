package com.uam.jaguarcare.modelo;

import java.time.*;
import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity
@Getter
@Setter
public class Visita {
	@Id 
    private String id;
	
   @ManyToOne(fetch = FetchType.LAZY)
    private Visitante visitante; 

    private LocalDate fecha;

    private LocalTime horaDeEntrada;

    private LocalTime horaDeSalida;

<<<<<<< HEAD
   @ManyToOne(fetch=FetchType.LAZY, optional = true)
   @DescriptionsList
    Sintomatologia sintomatologia; 
     
=======
    @Hidden
    private LocalTime horadeSalida;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "visitante_id")
    private Visitante visitante;

   /* @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "recepcionista_id")
    private Recepcionista AtendidoPor; */

>>>>>>> refs/remotes/origin/master
    @Enumerated(EnumType.STRING)
    private Destino destino;
    
    private String diagnostico;
    
    @ManyToMany(fetch=FetchType.LAZY)
    private List<Medicamento> medicamentos;
    
    private Integer cantidadDispensada;




}
