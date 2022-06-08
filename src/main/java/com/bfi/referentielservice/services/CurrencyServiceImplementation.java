package com.bfi.referentielservice.services;

import com.bfi.referentielservice.entities.Currency;
import com.bfi.referentielservice.repositories.CurrencyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CurrencyServiceImplementation implements CurrencyService {

    @Autowired
    CurrencyRepository currencyRepository;

    @Override
    public Currency addCurrency(Currency c) {
        return currencyRepository.save(c);
    }

    @Override
    public List<Currency> listCurrency() {
        return currencyRepository.findAll();
    }

    @Override
    public void deleteCurrency(Currency c) {
        currencyRepository.delete(c);

    }
}
