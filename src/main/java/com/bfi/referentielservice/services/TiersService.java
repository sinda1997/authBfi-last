package com.bfi.referentielservice.services;

import com.bfi.referentielservice.entities.Tiers;

import java.util.List;

public interface TiersService {
    Tiers addTiers (Tiers t);
    List<Tiers> listTiers();
    void deleteTiers (Tiers t);
}
