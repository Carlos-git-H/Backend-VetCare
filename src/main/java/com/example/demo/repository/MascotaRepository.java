package com.example.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.MascotaModel;
import org.springframework.stereotype.Repository;


@Repository
public interface MascotaRepository extends JpaRepository<MascotaModel,Integer> {

}
