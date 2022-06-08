package com.bfi.referentielservice.controller;
import com.bfi.referentielservice.entities.Compte;
import com.bfi.referentielservice.repositories.CompteRepository;
import com.bfi.referentielservice.services.CompteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController @RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class CompteController {
    @Autowired
    CompteService compteService;
    @Autowired
    CompteRepository compteRepository;

    @PostMapping("/addCompte")
    public Compte addCompte(@RequestBody Compte compte){
        return compteService.addCompte(compte);
    }

    @GetMapping("/listCompte")
    public List<Compte> listComptes(){
        return compteService.listComptes();
    }

    @DeleteMapping("/deleteCompte")
    public void deleteCompte(@PathVariable("id") Long id ){
    }

    @DeleteMapping("/deleteCompteById/{id}")
    public void deleteCompteById(@PathVariable("id") Long id){
        compteRepository.deleteById(id);

    }
    @PutMapping("/updateCompte")
    public Compte updateCompte(@RequestBody Compte compte){
        return compteService.updateCompte(compte);
    }

}
