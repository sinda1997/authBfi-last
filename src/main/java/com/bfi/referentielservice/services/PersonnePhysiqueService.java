package com.bfi.referentielservice.services;

import com.bfi.referentielservice.entities.PersonnePhysique;
import com.bfi.referentielservice.entities.Tiers;

import java.util.List;

public interface PersonnePhysiqueService {
    public PersonnePhysique addPersonnePhysique(PersonnePhysique pp);
    public List<PersonnePhysique> listPersonnePhysique();
    public void deletePersonnePhysique(PersonnePhysique pp);


}
