package com.example.gestionmagasinstock.Entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
public class DetailFacture  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDetailFacture ;
    private Integer qteCommandee;
    private float prixTotalDetail ;
    private Integer pourcentageRemise  ;
    private float montantRemise;


    @ManyToOne()
    Facture facture;
    @ManyToOne
    Produit produit;
}
