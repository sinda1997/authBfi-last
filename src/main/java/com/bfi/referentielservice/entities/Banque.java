package com.bfi.referentielservice.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.List;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class Banque extends Tiers implements Serializable {
    @Id @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private boolean bqloc;
    private String codbct;
    private String agcent;
    @OneToMany (mappedBy = "banque")
    private Collection<Compte> comptes;



}
