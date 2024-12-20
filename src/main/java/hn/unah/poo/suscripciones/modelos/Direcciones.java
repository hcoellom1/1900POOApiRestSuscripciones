package hn.unah.poo.suscripciones.modelos;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="direcciones")
public class Direcciones {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="iddireccion")
    private int idDirecion;

    private String departamento;

    private String ciudad;

    private String colonia;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="dni", referencedColumnName = "dni")
    @JsonIgnore
    private Cliente cliente;

}
