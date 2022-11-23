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
public class Produit implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProduit ;
    private String codeProduit ;
    private String libelleProduit ;

    private float prix;

    private Date dateCreation ;
    private Date dateDerniereModification ;

    @OneToMany(mappedBy = "produit")
    private Set<DetailFacture> detailFacture;

    @ManyToOne
    Stock stock;

    @ManyToOne
    CategorieProduit categorieProduit;
}
