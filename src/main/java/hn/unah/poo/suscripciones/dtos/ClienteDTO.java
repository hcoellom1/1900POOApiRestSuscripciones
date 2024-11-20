package hn.unah.poo.suscripciones.dtos;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ClienteDTO {

    private String dni;

    private String nombre;

    private String apellido;
    
    private LocalDate fechaIngreso;

    private String correo;

    private String telefono;

    private DireccioneDTO direccionDTO;
}
