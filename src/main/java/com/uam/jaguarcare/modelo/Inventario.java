package com.uam.jaguarcare.modelo;

import java.time.*;

import javax.persistence.*;

import lombok.*;

@Entity
@Getter
@Setter
public class Inventario {
	
	@Id

	private String numeroCompra;

	private LocalDate fecha;

 	@ManyToOne(fetch = FetchType.LAZY)
    private Medicamento medicamentoComprado; 

 	private Integer cantidadComprada; 
}
