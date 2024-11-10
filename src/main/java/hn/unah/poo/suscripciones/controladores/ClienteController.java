package hn.unah.poo.suscripciones.controladores;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.poo.suscripciones.dtos.ClienteDTO;
import hn.unah.poo.suscripciones.modelos.Cliente;

import hn.unah.poo.suscripciones.servicios.ClienteServicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

    @Autowired
    private ClienteServicio clienteServicio;

    @GetMapping("/obtener/dni")
    public ClienteDTO obtenerPorId(@RequestParam(name="id") String dni) {
        return this.clienteServicio.obtenerPorDni(dni);
    }

    @GetMapping("/obtener")
    public List<Cliente> obtenerTodos() {
        return this.clienteServicio.obtenerTodos();
    }

    
    
    
    
}
