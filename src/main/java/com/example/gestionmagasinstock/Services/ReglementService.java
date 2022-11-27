package com.example.gestionmagasinstock.Services;

import com.example.gestionmagasinstock.Entities.Facture;
import com.example.gestionmagasinstock.Entities.Reglement;
import com.example.gestionmagasinstock.Repository.FactureRepo;
import com.example.gestionmagasinstock.Repository.ReglementRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
@AllArgsConstructor
public class ReglementService implements IService<Reglement>,IReglement{

    ReglementRepo reglementRepo;
    FactureRepo factureRepo;
    @Override
    public Reglement Add(Reglement T) {
        return reglementRepo.save(T);
    }

    @Override
    public List<Reglement> GetAll() {
        return (List<Reglement>) reglementRepo.findAll();
    }

    @Override
    public Reglement Update(Reglement T) {
        return reglementRepo.save(T);
    }

    @Override
    public void Delete(Long id) {
        reglementRepo.deleteById(id);
    }

    @Override
    public Reglement getOne(Long id) {
        return reglementRepo.findById(id).orElse(null);
    }

    @Override
    public Set<Reglement> retrieveReglementByFacture(Long idFacture) {
        Facture f = factureRepo.findById(idFacture).orElse(null);
        return f.getReglements();
    }
}
