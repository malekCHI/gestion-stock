package com.example.gestionmagasinstock.Entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
public class Stock implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdStock ;
    private Integer qte ;
    private Integer ateMin  ;
    private String libelleStock ;

    @OneToMany(mappedBy = "stock")
    private Set<Produit> produits;

}
