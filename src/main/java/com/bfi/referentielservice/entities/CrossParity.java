package com.bfi.referentielservice.entities;

import com.bfi.referentielservice.entities.Currency;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class CrossParity implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    //private Long decimal;
    private Long quotity;
    @OneToMany(mappedBy = "crossParity")
    private Collection<Currency> currencies;
}
