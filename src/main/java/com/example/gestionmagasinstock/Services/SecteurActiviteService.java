package com.example.gestionmagasinstock.Services;

import com.example.gestionmagasinstock.Entities.SecteurActivite;
import com.example.gestionmagasinstock.Repository.SecteurActiviteRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class SecteurActiviteService implements IService<SecteurActivite>{

    SecteurActiviteRepo secteurActiviteRepo;
    @Override
    public SecteurActivite Add(SecteurActivite T) {
        return secteurActiviteRepo.save(T);
    }

    @Override
    public List<SecteurActivite> GetAll() {
        return (List<SecteurActivite>) secteurActiviteRepo.findAll();
    }

    @Override
    public SecteurActivite Update(SecteurActivite T) {
        return secteurActiviteRepo.save(T);
    }

    @Override
    public void Delete(Long id) {
        secteurActiviteRepo.deleteById(id);
    }

    @Override
    public SecteurActivite getOne(Long id) {
        return secteurActiviteRepo.findById(id).orElse(null);
    }
}
