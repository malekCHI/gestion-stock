package com.example.gestionmagasinstock.Services;

import com.example.gestionmagasinstock.Entities.Facture;

import java.util.List;

public interface IFacture {

    List<Facture> getFacturesByFournisseur(Long idFournisseur);

    void cancelFacture(Long id);
}
