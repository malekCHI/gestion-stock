package com.example.gestionmagasinstock.Repository;

import com.example.gestionmagasinstock.Entities.DetailFournisseur;
import com.example.gestionmagasinstock.Entities.Stock;
import org.springframework.data.repository.CrudRepository;

public interface StockRepo extends CrudRepository<Stock,Long> {
}
