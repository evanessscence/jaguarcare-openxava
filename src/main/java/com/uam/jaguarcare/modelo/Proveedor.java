
package com.uam.jaguarcare.modelo;
import java.util.*;

import javax.persistence.*;

import lombok.*;

@Entity
@Getter
@Setter
public class Proveedor {

    @Id
    private Integer cedula;
    @Column
    private String nombre;
    @Column
    private String compania;
    @Column
	private String correo;

   @OneToMany(fetch = FetchType.LAZY, mappedBy = "proveedor")
    private List<Compra> compras; 
}
