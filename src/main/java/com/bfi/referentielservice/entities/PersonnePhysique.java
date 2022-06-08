package com.bfi.referentielservice.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor @ToString
@DiscriminatorValue("PP")
public class PersonnePhysique extends Tiers implements Serializable {

    private int age;
    private String etatCivil;
    private String nomPere;
    private String nomMere;
    private String PaysNaissance;
    private String paysNationalite;
    private String paysResidence;
    private Long mobile;


}
