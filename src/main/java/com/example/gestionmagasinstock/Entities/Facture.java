package com.example.gestionmagasinstock.Entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;


@Entity
@Getter
@Setter
public class Facture implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long iDFacture;
    private float montantRemise ;
    private float montantFacture ;
    private Date dateCreationFacture ;
    private Date dateDerniereModification  ;
    private boolean archivee ;

    @OneToMany(mappedBy = "facture")
    private Set<Reglement> reglements;
    @OneToMany(mappedBy = "facture")
    private Set<DetailFacture> detailFactures;

    @ManyToOne
    Fournisseur fournisseur;

}
