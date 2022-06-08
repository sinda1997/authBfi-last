package com.bfi.referentielservice.controller;

import com.bfi.referentielservice.entities.Currency;
import com.bfi.referentielservice.services.CurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")

public class CurrencyController   {

    @Autowired
    CurrencyService currencyService;

    @PostMapping("/saveCurrency")
    public Currency addCurrency(@RequestBody Currency c){
        return currencyService.addCurrency(c);
    }

    @GetMapping("currencies")
    public List<Currency> listCurrency (){
        return currencyService.listCurrency();
    }

}
