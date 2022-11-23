package com.example.gestionmagasinstock.Repository;

import com.example.gestionmagasinstock.Entities.DetailFournisseur;
import com.example.gestionmagasinstock.Entities.SecteurActivite;
import org.springframework.data.repository.CrudRepository;

public interface SecteurActiviteRepo extends CrudRepository<SecteurActivite,Long> {
}
