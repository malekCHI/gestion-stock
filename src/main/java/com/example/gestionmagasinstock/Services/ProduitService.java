package com.example.gestionmagasinstock.Services;

import com.example.gestionmagasinstock.Entities.Produit;
import com.example.gestionmagasinstock.Repository.ProduitRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class ProduitService implements IService<Produit>{

    ProduitRepo produitRepo;
    @Override
    public Produit Add(Produit T) {
        return produitRepo.save(T);
    }

    @Override
    public List<Produit> GetAll() {
        return (List<Produit>) produitRepo.findAll();
    }

    @Override
    public Produit Update(Produit T) {
        return produitRepo.save(T);
    }

    @Override
    public void Delete(Long id) {
        produitRepo.deleteById(id);
    }

    @Override
    public Produit getOne(Long id) {
        return produitRepo.findById(id).orElse(null);
    }
}
