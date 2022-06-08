package com.bfi.referentielservice.services;

import com.bfi.referentielservice.entities.PersonnePhysique;
import com.bfi.referentielservice.entities.Tiers;
import com.bfi.referentielservice.repositories.PersonnePhysiqueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
 @Service
public class PersonnePhysiqueServiceImplementation implements PersonnePhysiqueService{

    @Autowired
    PersonnePhysiqueRepository personnePhysiqueRepository;

    @Override
    public PersonnePhysique addPersonnePhysique(PersonnePhysique pp) {

        return personnePhysiqueRepository.save(pp);
    }

    @Override
    public List<PersonnePhysique> listPersonnePhysique() {

        return personnePhysiqueRepository.findAll();
    }

    @Override
    public void deletePersonnePhysique(PersonnePhysique pp) {
        personnePhysiqueRepository.delete(pp);

    }
}
