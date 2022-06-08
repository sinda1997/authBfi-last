package com.bfi.referentielservice.services;

import com.bfi.referentielservice.entities.Country;
import com.bfi.referentielservice.repositories.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryServiceImplementation implements CountryService {

    @Autowired
    CountryRepository countryRepository;

    @Override
    public Country addCountry(Country c) {
        return countryRepository.save(c);
    }

    @Override
    public List<Country> listCountry() {
        return countryRepository.findAll();
    }

    @Override
    public void deleteCountry(Country c) {
        countryRepository.delete(c);
    }
}
