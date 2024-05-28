package com.uam.jaguarcare.modelo;

import java.time.*;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity
@Getter
@Setter
public class Inventario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Hidden
	private Long idInventario;

	private String numeroCompra; //Como ya no existe compra, no deberia borrarse?

	private LocalDate fecha;

 	@ManyToOne(fetch = FetchType.LAZY)
    private Medicamento medicamentoComprado; 

 	private Integer cantidadComprada; 
}