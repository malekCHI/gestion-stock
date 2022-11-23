package com.example.gestionmagasinstock.Services;

import com.example.gestionmagasinstock.Entities.Facture;
import com.example.gestionmagasinstock.Repository.FactureRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class FactureService implements IService<Facture>{

    FactureRepo factureRepo;
    @Override
    public Facture Add(Facture T) {
        return factureRepo.save(T);
    }

    @Override
    public List<Facture> GetAll() {
        return (List<Facture>) factureRepo.findAll();
    }

    @Override
    public Facture Update(Facture T) {
        return factureRepo.save(T);
    }

    @Override
    public void Delete(Long id) {
        factureRepo.deleteById(id);
    }

    @Override
    public Facture getOne(Long id) {
        return factureRepo.findById(id).orElse(null);
    }
}
