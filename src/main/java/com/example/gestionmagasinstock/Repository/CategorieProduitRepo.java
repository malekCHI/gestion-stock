package com.example.gestionmagasinstock.Repository;

import com.example.gestionmagasinstock.Entities.CategorieFournisseur;
import com.example.gestionmagasinstock.Entities.CategorieProduit;
import org.springframework.data.repository.CrudRepository;

public interface CategorieProduitRepo extends CrudRepository<CategorieProduit,Long> {
}
