package com.example.gestionmagasinstock.Services;

import com.example.gestionmagasinstock.Entities.Reglement;

import java.util.List;
import java.util.Set;

public interface IReglement {

    public Set<Reglement> retrieveReglementByFacture(Long idFacture);
}
