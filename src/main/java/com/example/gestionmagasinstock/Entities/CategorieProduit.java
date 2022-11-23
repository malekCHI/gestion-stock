package com.example.gestionmagasinstock.Entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CategorieProduit implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCategoneProduit ;
    private String codeProduit;
    private String libelleCategorieProduit ;

    @OneToMany(mappedBy = "categorieProduit")
    private Set<Produit> produits;
}
