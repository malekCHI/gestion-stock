package com.example.gestionmagasinstock.Services;

import com.example.gestionmagasinstock.Entities.CategorieProduit;
import com.example.gestionmagasinstock.Repository.CategorieProduitRepo;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@AllArgsConstructor
public class CategorieProduitService implements IService<CategorieProduit> {

    CategorieProduitRepo categorieProduitRepo;
    @Override
    public CategorieProduit Add(CategorieProduit T) {
        return categorieProduitRepo.save(T);
    }

    @Override
    public List<CategorieProduit> GetAll() {
        return (List<CategorieProduit>) categorieProduitRepo.findAll();
    }


    @Override
    public CategorieProduit Update( CategorieProduit T) {
        return categorieProduitRepo.save(T);
    }

    @Override
    public void Delete(Long id) {
         categorieProduitRepo.deleteById(id);
    }
    @Override
    public CategorieProduit getOne(Long id) {
        return categorieProduitRepo.findById(id).orElse(null);
    }
}
