package com.bfi.referentielservice.repositories;

import com.bfi.referentielservice.entities.Tiers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface PersonneMoraleRepository extends JpaRepository <Tiers, Long> {
}
