package com.bfi.referentielservice.repositories;

import com.bfi.referentielservice.entities.PersonnePhysique;
import com.bfi.referentielservice.entities.Tiers;
import com.google.common.util.concurrent.ListeningExecutorService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface PersonnePhysiqueRepository extends JpaRepository <PersonnePhysique,Long> {
    List<PersonnePhysique> findByNomContains(String nom);
    List<PersonnePhysique> findByNomPereContains(String nomPere);


}
