package com.uam.jaguarcare.modelo;

import javax.persistence.Entity;
import javax.persistence.Id;

import jakarta.persistence.Column;
import lombok.*;

@Entity
@Getter
@Setter
public class Sintomatologia {

	@Id     

	String id;
 
    @Column(length=50)
    String descripcion;
 }
