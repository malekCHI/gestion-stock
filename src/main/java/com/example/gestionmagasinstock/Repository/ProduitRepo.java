package com.example.gestionmagasinstock.Repository;

import com.example.gestionmagasinstock.Entities.DetailFournisseur;
import com.example.gestionmagasinstock.Entities.Produit;
import org.springframework.data.repository.CrudRepository;

public interface ProduitRepo extends CrudRepository<Produit,Long> {
}
