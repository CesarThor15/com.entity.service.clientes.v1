package com.entity.service.clientes.v1.service;

import com.entity.service.clientes.v1.entity.Clientes;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class ClienteCrudImpl implements IdClientesService {

    private static Map<Long, Clientes> clientes = new HashMap<>();
    private static Long index = 0L;
    //private Object clientelist;


    @Override
    public List<Clientes> getListClientes() {
        return new ArrayList<>(clientes.values());
    }

    @Override
    public Clientes getClientesById(long ClienteId) {
        return clientes.get(ClienteId);
    }

    @Override
    public Clientes addClientes(Clientes cliente) {
        index +=1;
        cliente.setId(index);
        clientes.put(index, cliente);
        return cliente;
    }

    @Override
    public Clientes eliminaClientes(Long clienteId) {
        return clientes.remove(clienteId);
    }

    @Override
    public Clientes actualizaClientes(long id, Clientes cliente) {
        cliente.setId(id);
        clientes.put(id, cliente);
        return cliente;
    }
}
