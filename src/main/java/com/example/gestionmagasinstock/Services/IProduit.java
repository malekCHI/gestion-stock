package com.example.gestionmagasinstock.Services;

import com.example.gestionmagasinstock.Entities.Produit;

public interface IProduit {
    void assignProduitToStock(Long idProduit, Long idStock);

    Produit addProduit (Produit p, Long idCategorieProduit, Long idStock);
    Produit updateProduit (Produit p, Long idCategorieProduit, Long idStock);
}
