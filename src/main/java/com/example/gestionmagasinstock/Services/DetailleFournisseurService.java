package com.example.gestionmagasinstock.Services;

import com.example.gestionmagasinstock.Entities.DetailFournisseur;
import com.example.gestionmagasinstock.Repository.DetailleFournisseurRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class DetailleFournisseurService implements IService<DetailFournisseur>{

    DetailleFournisseurRepo detailleFournisseurRepo;
    @Override
    public DetailFournisseur Add(DetailFournisseur T) {
        return detailleFournisseurRepo.save(T);
    }

    @Override
    public List<DetailFournisseur> GetAll() {
        return (List<DetailFournisseur>) detailleFournisseurRepo.findAll();
    }

    @Override
    public DetailFournisseur Update(DetailFournisseur T) {
        return detailleFournisseurRepo.save(T);
    }

    @Override
    public void Delete(Long id) {
        detailleFournisseurRepo.deleteById(id);
    }

    @Override
    public DetailFournisseur getOne(Long id) {
        return detailleFournisseurRepo.findById(id).orElse(null);
    }
}
