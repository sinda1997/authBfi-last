package com.bfi.referentielservice.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
public class Country implements Serializable {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String areaPhoneCode;
    private String name;
    private String numericCode;
    private String translatedName;
    private String nationality;
    private boolean taxConvention;
    private boolean enbargo;
    @OneToMany (mappedBy = "country")
    private Collection<Tiers> tiers;

}
