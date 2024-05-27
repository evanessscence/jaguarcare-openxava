package com.uam.jaguarcare.modelo;



import javax.persistence.*;

import lombok.*;

@Entity
@Getter
@Setter
public class Recepcionista {
    @Id
    String Cedula;
    @Column(length=50)
    String name;
    String password;

}
