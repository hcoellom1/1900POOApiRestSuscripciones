package hn.unah.poo.suscripciones.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hn.unah.poo.suscripciones.modelos.Cliente;

@Repository
public interface ClienteRepositorio extends JpaRepository<Cliente, String>{
    
}
