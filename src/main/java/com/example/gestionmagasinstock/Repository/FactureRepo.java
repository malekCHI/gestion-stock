package com.example.gestionmagasinstock.Repository;

import com.example.gestionmagasinstock.Entities.DetailFournisseur;
import com.example.gestionmagasinstock.Entities.Facture;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FactureRepo extends CrudRepository<Facture,Long> {
//ritha hadhy awel harff ytkteb en majuscule
    List<Facture> findByFournisseurIdFournisseur(Long idFournisseur);
}
