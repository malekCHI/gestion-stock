package com.example.gestionmagasinstock.Services;

import com.example.gestionmagasinstock.Entities.Operateur;
import com.example.gestionmagasinstock.Repository.OperateurRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class OperateurService implements IService<Operateur>{

    OperateurRepo operateurRepo;
    @Override
    public Operateur Add(Operateur T) {
        return operateurRepo.save(T);
    }

    @Override
    public List<Operateur> GetAll() {
        return (List<Operateur>) operateurRepo.findAll();
    }

    @Override
    public Operateur Update(Operateur T) {
        return operateurRepo.save(T);
    }

    @Override
    public void Delete(Long id) {
        operateurRepo.deleteById(id);
    }

    @Override
    public Operateur getOne(Long id) {
        return operateurRepo.findById(id).orElse(null);
    }
}
