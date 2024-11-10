package hn.unah.poo.suscripciones.modelos;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="clientes")
public class Cliente {
    
    @Id
    private String dni;

    private String nombre;

    private String apellido;

    @Column(name="fechaingreso")
    private LocalDate fechaIngreso;

    private String correo;

    private String telefono;

}
