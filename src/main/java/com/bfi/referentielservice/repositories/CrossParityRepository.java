package com.bfi.referentielservice.repositories;

import com.bfi.referentielservice.entities.CrossParity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CrossParityRepository extends JpaRepository<CrossParity,Long> {
}
