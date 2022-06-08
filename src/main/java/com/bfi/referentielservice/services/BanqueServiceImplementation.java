package com.bfi.referentielservice.services;

import com.bfi.referentielservice.entities.Banque;
import com.bfi.referentielservice.repositories.BanqueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BanqueServiceImplementation implements BanqueService {

    @Autowired
    BanqueRepository banqueRepository;

    @Override
    public Banque addBanque(Banque banque) {
        return banqueRepository.save(banque);
    }

    @Override
    public List<Banque> listBanque() {
        return banqueRepository.findAll();
    }

    @Override
    public void deleteBanque(Banque banque) {
        banqueRepository.delete(banque);

    }
}
