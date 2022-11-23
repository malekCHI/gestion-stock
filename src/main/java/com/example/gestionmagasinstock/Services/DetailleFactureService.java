package com.example.gestionmagasinstock.Services;

import com.example.gestionmagasinstock.Entities.DetailFacture;
import com.example.gestionmagasinstock.Entities.DetailFournisseur;
import com.example.gestionmagasinstock.Repository.DetailleFactureRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class DetailleFactureService implements IService<DetailFacture>{

    DetailleFactureRepo detailleFactureRepo;

    @Override
    public DetailFacture Add(DetailFacture T) {
        return detailleFactureRepo.save(T);
    }

    @Override
    public List<DetailFacture> GetAll() {
        return (List<DetailFacture>) detailleFactureRepo.findAll();
    }

    @Override
    public DetailFacture Update(DetailFacture T) {
        return detailleFactureRepo.save(T);
    }

    @Override
    public void Delete(Long id) {
            detailleFactureRepo.deleteById(id);
    }

    @Override
    public DetailFacture getOne(Long id) {
        return detailleFactureRepo.findById(id).orElse(null);
    }
}
