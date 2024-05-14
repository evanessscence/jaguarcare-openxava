package com.uam.jaguarcare.modelo;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
public class Recepcionista {
    @Id
    private String CIF;
    private String nombre;
    private String contrasenia;

  /*  @OneToMany(fetch = FetchType.LAZY,mappedBy = "usuario")
    List<Visita> visitas; */
}
