package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.ClienteModel;

@Repository
public interface ClienteRepository extends CrudRepository<ClienteModel, Integer> {
    
}
