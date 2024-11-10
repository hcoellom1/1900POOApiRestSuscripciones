package hn.unah.poo.suscripciones.servicios;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import hn.unah.poo.suscripciones.dtos.ClienteDTO;
import hn.unah.poo.suscripciones.modelos.Cliente;
import hn.unah.poo.suscripciones.repositorios.ClienteRepositorio;

@Service
public class ClienteServicio {

    @Autowired
    private ClienteRepositorio clienteRepositorio;

    @Autowired
    private ModelMapper modelMapper;
    
    public List<Cliente> obtenerTodos(){
        return clienteRepositorio.findAll();
    }

    public ClienteDTO obtenerPorDni(String dni){
        modelMapper = new ModelMapper();
        Cliente cliente = clienteRepositorio.findById(dni).get();
        ClienteDTO clienteDto =  this.modelMapper.map(cliente, ClienteDTO.class);

        return clienteDto;
    }

}
