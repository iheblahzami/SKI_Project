package com.example.demo.services;

import com.example.demo.entities.*;
import com.example.demo.repositories.AbonnementRepository;
import com.example.demo.repositories.InscriptionRepository;
import com.example.demo.repositories.PisteRepository;
import com.example.demo.repositories.SkieurRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ISkieurServiceImp implements ISkieurService{

    @Autowired //(t3awedh = new SkieurRepository ) creer instance automatique
   private   SkieurRepository skieurRepository  ;
    private final PisteRepository pisteRepository;
    private  AbonnementRepository abonnementRepository;
private  InscriptionRepository inscriptionRepository ;
    private ICoursService coursService;

    @Override
    public List<Skieur> retrieveAllSkieurs() {

        return (List<Skieur>) skieurRepository.findAll();
    }

    @Override
    public Skieur updateSkieur(Skieur skieur) {

        return (Skieur) skieurRepository.save(skieur);
    }

    @Override
    public Skieur addSkieur(Skieur skieur) {
        skieurRepository.save(skieur);
        return null;
    }

    @Override
    public void removeSkieur(Long numSkieur) {

        skieurRepository.deleteById(numSkieur);
    }

    @Override
    public Skieur retrieveSkieurById(Long numSkieur) {

        return skieurRepository.findById(numSkieur ).orElse(null); //getbyid
    }
    public   Skieur assignSkieurToPiste(long numSkieur, long numPiste) {
        Skieur skieur = skieurRepository.findById(numSkieur).orElse(null);
        Assert.notNull(skieur,"skieur not found ");
        Piste piste = pisteRepository.findById(numPiste).orElse(null);
        Assert.notNull(piste,"404 not found ");
        skieur.getPistes().add(piste);

        return skieurRepository.save(skieur);

    }



    @Override
    public Skieur addSkierAndAssignToCourse(Skieur skieur) {
        //Créer Abonnement
        Abonnement a = skieur.getAbonnement();
        if(a != null && skieur.getInscriptions() != null){
            abonnementRepository.save(a);
            inscriptionRepository.saveAll(skieur.getInscriptions());
            return skieurRepository.save(skieur);}
        return null;
    }



    @Override
    public List<Skieur> retrieveSkiersBySubscriptionType(TypeAbonnement typeAbonnement) {
        //return getAll().stream().filter(skieur -> skieur.getAbonnement().getTypeAbon()== typeAbonnement).collect(Collectors.toList());
       return skieurRepository.findByAbonnementTypeAbon(typeAbonnement);
    }
    }



