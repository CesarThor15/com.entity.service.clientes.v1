package com.entity.service.clientes.v1.service;

import com.entity.service.clientes.v1.entity.Clientes;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface IdClientesService {

    List<Clientes> getListClientes();

    Clientes getClientesById(long ClienteId);
    Clientes addClientes(Clientes cliente);
    Clientes eliminaClientes(Long clienteId);
    Clientes actualizaClientes(long id, Clientes cliente);

}
