package com.example.gestionmagasinstock.Entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@ToString
public class Stock implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdStock ;
    private Integer qte ;
    private Integer ateMin  ;
    private String libelleStock ;

    @OneToMany(fetch =FetchType.EAGER,mappedBy = "stock")
    @ToString.Exclude
    private Set<Produit> produits;

}
