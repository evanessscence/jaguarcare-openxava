package com.uam.jaguarcare.modelo;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.openxava.annotations.*;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
public class Sintomatologia {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Hidden
	private Long idSintomatologia;
 
    @Column(length=50)
    String descripcion;
 }
