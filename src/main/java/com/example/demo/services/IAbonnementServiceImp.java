package com.example.demo.services;

import com.example.demo.entities.Abonnement;
import com.example.demo.entities.TypeAbonnement;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Service
public class IAbonnementServiceImp implements IAbonnementService{
    @Override
    public void addAbonnement(Abonnement a) {

    }

    @Override
    public Abonnement updateAbonnement(Abonnement a) {
        return null;
    }

    @Override
    public List<Abonnement> getAllAbonnements() {
        return null;
    }

    @Override
    public Abonnement getAbonnementById(long id) {
        return null;
    }

    @Override
    public void removeAbonnement(long id) {

    }

    @Override
    public Set<Abonnement> getSubscriptionByType(TypeAbonnement type) {
        return null;
    }

    @Override
    public Set<Abonnement> retrieveSubscriptionsByDates(LocalDate startDate, LocalDate endDate) {
        return null;
    }
}
