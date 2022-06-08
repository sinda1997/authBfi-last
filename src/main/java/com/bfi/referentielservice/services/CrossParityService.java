package com.bfi.referentielservice.services;

import com.bfi.referentielservice.entities.CrossParity;

import java.util.List;

public interface CrossParityService {
    CrossParity addCrossParity(CrossParity cp);
    List<CrossParity> listCrossParity();
    void deleteCrossParity(CrossParity cp);
}
