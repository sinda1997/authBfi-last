package com.bfi.referentielservice.services;

import com.bfi.referentielservice.entities.CurrencyPrice;

import java.util.List;

public interface CurrencyPriceService {
     CurrencyPrice addCurrencyPrice(CurrencyPrice cp);
     List<CurrencyPrice> listCp();
     void deleteCurrencyPrice(CurrencyPrice cp);
}
