package com.uam.jaguarcare.modelo;

import java.time.*;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity
@Getter
@Setter
public class Visita {
    @Id @Hidden
    @SequenceGenerator(
            name = "visita_sequence",
            sequenceName = "visita_sequence",
            allocationSize = 1,
            initialValue = 1000
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "visita_sequence"
    )
    private Integer id;

    private LocalDate fecha;

 
    private LocalTime HoraDeEntrada;

    @PrePersist
    public void createdAt()
    {
        this.fecha = LocalDate.now();
        this.horadeSalida = LocalTime.now();
    }

    @Hidden
    private LocalTime horadeSalida;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "visitante_id")
    private Visitante visitante;

   /* @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "recepcionista_id")
    private Recepcionista AtendidoPor; */

    private String diagnostico;
    private Integer cantidadDispensada;

 /*@OneToMany(fetch = FetchType.LAZY, mappedBy = "visita")
    private List<Medicamento> medicamentos;*/

@ManyToOne(fetch=FetchType.LAZY)
@JoinColumn(name = "sintomatologia_id")
    private Sintomatologia sintomatologia;
}
