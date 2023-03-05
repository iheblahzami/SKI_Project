package com.example.demo.repositories;

import com.example.demo.entities.Piste;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PisteRepository extends CrudRepository<Piste, Long> {


}