package com.example.gestionmagasinstock.Services;

import com.example.gestionmagasinstock.Entities.Fournisseur;
import com.example.gestionmagasinstock.Repository.FournisseurRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class FournisseurService implements IService<Fournisseur>{

    FournisseurRepo fournisseurRepo;
    @Override
    public Fournisseur Add(Fournisseur T) {
        return fournisseurRepo.save(T);
    }

    @Override
    public List<Fournisseur> GetAll() {
        return (List<Fournisseur>) fournisseurRepo.findAll();
    }

    @Override
    public Fournisseur Update(Fournisseur T) {
        return fournisseurRepo.save(T);
    }

    @Override
    public void Delete(Long id) {
        fournisseurRepo.deleteById(id);
    }

    @Override
    public Fournisseur getOne(Long id) {
        return fournisseurRepo.findById(id).orElse(null);
    }
}
