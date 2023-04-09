package com.example.demo.repositories;

import com.example.demo.entities.Skieur;
import com.example.demo.entities.TypeAbonnement;
import com.example.demo.entities.TypeCours;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SkieurRepository extends CrudRepository<Skieur, Long> {
    @Query("select s from Skieur s where s.abonnement.typeAbonnement = Skieur.abonnement.typeAbonnement")
    List<Skieur> findByAbonnementTypeAbon(TypeAbonnement typeAbonnement);
    List<Skieur> findByInscriptionsCoursTypeCours(TypeCours typeCours);

}