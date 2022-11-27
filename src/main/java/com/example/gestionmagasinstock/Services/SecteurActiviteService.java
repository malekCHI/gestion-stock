package com.example.gestionmagasinstock.Services;

import com.example.gestionmagasinstock.Entities.Fournisseur;
import com.example.gestionmagasinstock.Entities.Produit;
import com.example.gestionmagasinstock.Entities.SecteurActivite;
import com.example.gestionmagasinstock.Entities.Stock;
import com.example.gestionmagasinstock.Repository.FournisseurRepo;
import com.example.gestionmagasinstock.Repository.SecteurActiviteRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@AllArgsConstructor
public class SecteurActiviteService implements IService<SecteurActivite>,ISecteurActivite{

    SecteurActiviteRepo secteurActiviteRepo;
    FournisseurRepo fournisseurRepo;
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

    @Transactional
    public void assignSecteurActiviteToFournisseur(Long fournisseurId, Long secteurActiviteId) {
        SecteurActivite s = secteurActiviteRepo.findById(fournisseurId).orElse(null);
        Fournisseur f = fournisseurRepo.findById(secteurActiviteId).orElse(null);
        //hna secteur how child w fournisseur howa parent
        f.getSecteurActivites().add(s);
        fournisseurRepo.save(f);
    }
}
