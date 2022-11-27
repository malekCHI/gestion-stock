package com.example.gestionmagasinstock.Services;

import com.example.gestionmagasinstock.Entities.CategorieProduit;
import com.example.gestionmagasinstock.Entities.Produit;
import com.example.gestionmagasinstock.Entities.Stock;
import com.example.gestionmagasinstock.Repository.CategorieProduitRepo;
import com.example.gestionmagasinstock.Repository.ProduitRepo;
import com.example.gestionmagasinstock.Repository.StockRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class ProduitService implements IService<Produit>,IProduit{

    ProduitRepo produitRepo;
    CategorieProduitRepo categorieProduitRepo;
    StockRepo stockRepo;
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

    @Override
    public void assignProduitToStock(Long idProduit, Long idStock) {
        Produit p = produitRepo.findById(idProduit).orElse(null);
        Stock s = stockRepo.findById(idStock).orElse(null);
        p.setStock(s);
        produitRepo.save(p);
    }

    @Override
    public Produit addProduit(Produit p, Long idCategorieProduit, Long idStock) {
        CategorieProduit categorieProduit= categorieProduitRepo.findById(idCategorieProduit).orElse(null);
        Stock stock =stockRepo.findById(idStock).orElse(null);
        p.setCategorieProduit(categorieProduit);
        p.setStock(stock);
        return produitRepo.save(p);
    }

    @Override
    public Produit updateProduit(Produit p, Long idCategorieProduit, Long idStock) {
        CategorieProduit categorieProduit = categorieProduitRepo.findById(idCategorieProduit).orElse(null);
        Stock stock = stockRepo.findById(idStock).orElse(null);
        categorieProduit.getProduits().add(p);
        stock.getProduits().add(p);
        return produitRepo.save(p);
    }
}

