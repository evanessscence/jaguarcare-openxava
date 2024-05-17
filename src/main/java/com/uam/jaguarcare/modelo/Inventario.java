package com.uam.jaguarcare.modelo;

import java.time.*;
import java.util.*;

import javax.persistence.*;

import lombok.*;

@Entity
@Getter
@Setter
public class Compra{
	@Id
	private Integer NumeroDeFactura;

	private LocalDate fecha;

@ManyToMany(fetch=FetchType.LAZY)
	@JoinTable(name = "compra_medicamento", joinColumns = @JoinColumn(name = "compra_id"),
			inverseJoinColumns = @JoinColumn(name = "medicamento_id"))
	private List<Medicamento> medicamento;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "proveedor_id")
	private Proveedor proveedor; 

}
