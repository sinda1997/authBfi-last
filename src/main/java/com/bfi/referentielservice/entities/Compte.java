package com.bfi.referentielservice.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Compte implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String numCpt;
    private String description;
    private String rib;
    private double soldeComptable;
    private double soldeDisponible;
    private boolean cloture;
    //private Date dateCloture;

    @ManyToOne
    private Banque banque;
    @ManyToOne
    private Tiers tiers;
    @ManyToOne
    Currency currency;
    //@OneToMany(mappedBy = "compte")
    //private Collection<Currency> currencies;
    @ManyToOne
    private Ugest ugest;
}
