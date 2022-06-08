package com.bfi.referentielservice.repositories;

import com.bfi.referentielservice.entities.Currency;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CurrencyRepository extends JpaRepository<Currency,Long> {
}
