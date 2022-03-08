package com.entity.service.clientes.v1.controller;

import com.entity.service.clientes.v1.entity.Clientes;
import com.entity.service.clientes.v1.service.IdClientesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
@RequestMapping("/")
public class CrudController {

    @Autowired
    IdClientesService listaclienteservice;

    @GetMapping(value = "/listclientes", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> getAll(){
        return ResponseEntity.ok(this.listaclienteservice.getListClientes());
    }

    @GetMapping(value = "/buscarId/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> findById(@PathVariable long id){
        return ResponseEntity.ok(this.listaclienteservice.getClientesById(id) );
    }

    @PostMapping(value = "/add", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> add(@RequestBody Clientes cliente){
        return ResponseEntity.ok(this.listaclienteservice.addClientes(cliente));
    }

    @PutMapping(value = "/update/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> update(@PathVariable long id, @RequestBody Clientes cliente){
        return ResponseEntity.ok(this.listaclienteservice.actualizaClientes(id, cliente) );
    }

    @DeleteMapping(value = "/delete/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> deleteById(@PathVariable long id){
        return ResponseEntity.ok(this.listaclienteservice.eliminaClientes(id) );
    }





}
