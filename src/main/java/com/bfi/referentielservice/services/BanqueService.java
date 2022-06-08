package com.bfi.referentielservice.services;

import com.bfi.referentielservice.entities.Banque;
import com.bfi.referentielservice.entities.Compte;
import org.springframework.stereotype.Service;

import java.util.List;


public interface BanqueService {
    public Banque addBanque(Banque banque);
    public List<Banque> listBanque();
    public void deleteBanque(Banque banque);
}
