package com.bfi.referentielservice.services;

import com.bfi.referentielservice.entities.CrossParity;
import com.bfi.referentielservice.repositories.CrossParityRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CrossParityServiceImplementation implements CrossParityService{

    @Autowired
    CrossParityRepository crossParityRepository;

    @Override
    public CrossParity addCrossParity(CrossParity cp) {
        return crossParityRepository.save(cp);
    }

    @Override
    public List<CrossParity> listCrossParity() {
        return crossParityRepository.findAll();
    }

    @Override
    public void deleteCrossParity(CrossParity cp) {
        crossParityRepository.delete(cp);
    }
}
