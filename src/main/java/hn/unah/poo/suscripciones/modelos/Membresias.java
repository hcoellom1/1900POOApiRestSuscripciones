package hn.unah.poo.suscripciones.modelos;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="membresias")
public class Membresias {

    @Id
    @Column(name="idmembresia")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int idmembresia;

    private double precio;

    private String descripcion;

    private char tipo;

    @ManyToOne
    @JoinColumn(name="dni", referencedColumnName = "dni")
    @JsonIgnore
    private Cliente cliente;
    
}
