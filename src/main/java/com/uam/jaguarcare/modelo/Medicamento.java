package com.uam.jaguarcare.modelo;

import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity
@Getter
@Setter
public class Medicamento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Hidden
	private Long idMedicamento;
	
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
    @Column
    private Integer cantidadDisponible;

	@Column
	private Integer cantidadMinima;
    
    /* @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "visita_id")
    private Visita visita;*/

}
