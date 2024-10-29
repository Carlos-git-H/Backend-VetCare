package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.ClienteModel;
import com.example.demo.repository.ClienteRepository;

@RestController
@CrossOrigin("*")
@RequestMapping("/api")
public class ClienteController {
    @Autowired
    public ClienteRepository clienteRepository;

    @GetMapping(value ="/cliente")
    public Iterable<ClienteModel> getAllClientes(){
        return clienteRepository.findAll();
    }

    @PostMapping(value = "/cliente/new")
    public ClienteModel saveCliente(@RequestBody ClienteModel cliente){
        return clienteRepository.save(cliente);
    }

    @DeleteMapping(value="/cliente/delete/{id}")
    public void deleteCliente(@PathVariable Integer id){
        clienteRepository.deleteById(id);
    }
}
