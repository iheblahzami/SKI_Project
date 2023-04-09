package com.example.demo.services;

import com.example.demo.entities.Abonnement;
import com.example.demo.entities.TypeAbonnement;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

public interface IAbonnementService {
    void addAbonnement (Abonnement a);
    Abonnement updateAbonnement(Abonnement a);
    List<Abonnement> getAllAbonnements();
    Abonnement getAbonnementById(long id);
    void removeAbonnement(long id);
    Set<Abonnement> getSubscriptionByType(TypeAbonnement type);
    Set<Abonnement> retrieveSubscriptionsByDates(LocalDate startDate,LocalDate endDate);
}
