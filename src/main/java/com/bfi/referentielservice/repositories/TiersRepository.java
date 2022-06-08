package com.bfi.referentielservice.repositories;

import com.bfi.referentielservice.entities.PersonnePhysique;
import com.bfi.referentielservice.entities.Tiers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface TiersRepository extends JpaRepository<Tiers,Long> {
    List<Tiers> findByNomContains (String nom);

}
