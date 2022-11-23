package com.example.gestionmagasinstock.Entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
public class SecteurActivite implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ldsecteurActivite ;
    private String codeSecteurActivite ;
    private String libelleSecteurActivite ;

    @ManyToMany(mappedBy = "secteurActivites")
    private Set<Fournisseur> fournisseurs;

}
