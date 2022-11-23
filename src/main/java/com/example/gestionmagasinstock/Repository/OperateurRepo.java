package com.example.gestionmagasinstock.Repository;

import com.example.gestionmagasinstock.Entities.DetailFournisseur;
import com.example.gestionmagasinstock.Entities.Operateur;
import org.springframework.data.repository.CrudRepository;

public interface OperateurRepo extends CrudRepository<Operateur,Long> {
}
