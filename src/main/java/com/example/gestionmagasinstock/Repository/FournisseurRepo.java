package com.example.gestionmagasinstock.Repository;

import com.example.gestionmagasinstock.Entities.DetailFournisseur;
import com.example.gestionmagasinstock.Entities.Fournisseur;
import org.springframework.data.repository.CrudRepository;

public interface FournisseurRepo extends CrudRepository<Fournisseur,Long> {
}
