package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repository.MascotaRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.entity.MascotaModel;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@CrossOrigin ("*")
@RequestMapping("/api")
public class MascotaController {

    @Autowired
    public MascotaRepository mascotaRepository;

    @GetMapping(value="/mascotas")
    public Iterable<MascotaModel> getAllMascotas(){
        return mascotaRepository.findAll();
    }
    
    @PostMapping (value="/mascota/new")
    public MascotaModel saveMascotas(@RequestBody MascotaModel mascota){
        return mascotaRepository.save(mascota);
    }

    @DeleteMapping(value="/mascota/delete/{id}")
    public void deleteMascota(@PathVariable Integer id){
        mascotaRepository.deleteById(id);
    }
    
}