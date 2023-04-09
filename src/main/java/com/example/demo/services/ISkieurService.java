package com.example.demo.services;


import com.example.demo.entities.Skieur;
import com.example.demo.entities.TypeAbonnement;

import java.util.List;

public interface ISkieurService {
    static Skieur assignSkieurToPiste(long numSkieur, long numPiste) {
        return null;
    }

    List<Skieur> retrieveAllSkieurs();

    Skieur updateSkieur(Skieur skieur);

    Skieur addSkieur(Skieur skieur);

    void removeSkieur (Long numSkieur);
    Skieur retrieveSkieurById (Long numSkieur);


    Skieur addSkierAndAssignToCourse(Skieur skieur);

    List<Skieur> retrieveSkiersBySubscriptionType(TypeAbonnement typeAbonnement);
}
