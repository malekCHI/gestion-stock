package com.example.gestionmagasinstock.Repository;

import com.example.gestionmagasinstock.Entities.DetailFacture;
import com.example.gestionmagasinstock.Entities.DetailFournisseur;
import org.springframework.data.repository.CrudRepository;

public interface DetailleFournisseurRepo extends CrudRepository<DetailFournisseur ,Long> {
}
