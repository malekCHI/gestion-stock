package com.example.gestionmagasinstock.Entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
public class Fournisseur implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFournisseur;
    private  String codeFournisseur ;
    private String libelleFournisseur;
    @Enumerated(EnumType.STRING)
    private CategorieFournisseur categorieFournisseur  ;

    @OneToMany(mappedBy = "fournisseur")
    private Set<Facture> factures;

    @OneToOne(cascade = CascadeType.ALL)
    DetailFournisseur detailFournisseur;

    @ManyToMany
    private Set<SecteurActivite>secteurActivites;
}
