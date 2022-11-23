package com.example.gestionmagasinstock.Repository;

import com.example.gestionmagasinstock.Entities.CategorieProduit;
import com.example.gestionmagasinstock.Entities.DetailFacture;
import org.springframework.data.repository.CrudRepository;

public interface DetailleFactureRepo extends CrudRepository<DetailFacture,Long> {
}
