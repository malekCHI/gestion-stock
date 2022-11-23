package com.example.gestionmagasinstock.Repository;

import com.example.gestionmagasinstock.Entities.DetailFournisseur;
import com.example.gestionmagasinstock.Entities.Facture;
import org.springframework.data.repository.CrudRepository;

public interface FactureRepo extends CrudRepository<Facture,Long> {
}
