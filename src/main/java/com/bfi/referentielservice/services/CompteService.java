package com.bfi.referentielservice.services;

import com.bfi.referentielservice.entities.Banque;
import com.bfi.referentielservice.entities.Compte;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CompteService {
    Compte addCompte(Compte compte);
    List<Compte> listComptes();
    void deleteCompte (Compte compte);
    Compte updateCompte (Compte compte );
    //void deleteCompteById





}
