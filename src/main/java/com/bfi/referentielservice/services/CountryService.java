package com.bfi.referentielservice.services;

import com.bfi.referentielservice.entities.Country;

import java.util.List;

public interface CountryService {
    Country addCountry(Country c);
    List<Country> listCountry();
    void deleteCountry(Country c);
}
