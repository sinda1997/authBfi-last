package com.bfi.referentielservice.controller;

import com.bfi.referentielservice.entities.Compte;
import com.bfi.referentielservice.entities.PersonnePhysique;
import com.bfi.referentielservice.repositories.PersonnePhysiqueRepository;
import com.bfi.referentielservice.services.PersonnePhysiqueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PersonnePhysiqueController   {

    @Autowired
    PersonnePhysiqueService personnePhysiqueService;
    @Autowired
    PersonnePhysiqueRepository personnePhysiqueRepository;

    @PostMapping(value = "/addClient")
    PersonnePhysique addPersonnePhysique(@RequestBody PersonnePhysique pp){
        return personnePhysiqueService.addPersonnePhysique(pp);
    }
    @GetMapping(value = "/listClient")
    public List<PersonnePhysique> listComptes() {
        return personnePhysiqueService.listPersonnePhysique();
    }

    @GetMapping(value="/findByFirstNameContains/{name}")
    List<PersonnePhysique> rechercheTiers(@PathVariable(name = "nom") String nom){
        return personnePhysiqueRepository.findByNomContains(nom);
    }

    @RequestMapping(value="/findByNomPereContains/{nomPere}",method = RequestMethod.GET)
    List<PersonnePhysique> findByNomPere(@PathVariable(name="nomPere") String nomPere){
        return personnePhysiqueRepository.findByNomPereContains(nomPere);
    }

}
