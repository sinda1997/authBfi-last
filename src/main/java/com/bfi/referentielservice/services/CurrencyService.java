package com.bfi.referentielservice.services;

import com.bfi.referentielservice.entities.Currency;

import java.util.List;

public interface CurrencyService {
    public Currency addCurrency(Currency c);
    public List<Currency> listCurrency ();
    public void deleteCurrency (Currency c);
}
