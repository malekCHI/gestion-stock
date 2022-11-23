package com.example.gestionmagasinstock.Repository;

import com.example.gestionmagasinstock.Entities.DetailFournisseur;
import com.example.gestionmagasinstock.Entities.Reglement;
import org.springframework.data.repository.CrudRepository;

public interface ReglementRepo extends CrudRepository<Reglement,Long> {
}
