package com.bfi.referentielservice.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CurrencyPrice implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date priceDate;
    private Long buyPrice;
    private Long sellPrice;
    private boolean statut;
    private Long fourchette;
    private String commen;
    private Long envoi;
    @OneToMany(mappedBy = "deviseAchat")
    private Collection<Currency>currencies;
    @OneToMany(mappedBy = "deviseVente")
    private Collection<Currency>devises;


}
