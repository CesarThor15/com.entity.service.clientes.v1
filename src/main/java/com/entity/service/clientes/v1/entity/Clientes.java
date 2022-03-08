package com.entity.service.clientes.v1.entity;

import lombok.Data;

@Data
public class Clientes {
    private Long id;
    private String nombre;
    private String correo;

    public Clientes(Long id, String nombre, String correo) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
    }
}
