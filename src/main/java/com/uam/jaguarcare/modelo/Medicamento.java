package com.uam.jaguarcare.modelo;

import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import org.openxava.annotations.*;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.SequenceGenerator;
import lombok.*;

@Entity
@Getter
@Setter
public class Medicamento {
	
	  @SequenceGenerator(
	            name = "med_sequence",
	            sequenceName = "med_sequence",
	            allocationSize = 1,
	            initialValue = 1000
	    )
	    @GeneratedValue(
	            strategy = GenerationType.SEQUENCE,
	            generator = "med_sequence"
	    )
    @Id
    @Hidden
    private Integer id;
    @Column
    private String nombreComercial;
    @Column
    private String nombreGenerico;
    @Column
    private String dosis;
    
    @Enumerated(EnumType.STRING)
    private PresentacionMedicamento presentacion;
    @Column
	private String lote;
    @Column
    private Date vencimiento;
    @Column
    private String indicaciones;
    
    private Integer cantidad;
    
    /* @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "visita_id")
    private Visita visita;*/

 	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "medicamento")
    private List<Compra> compra; 
}
