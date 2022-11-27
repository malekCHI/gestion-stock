package com.example.gestionmagasinstock.Services;

import java.util.List;

public interface IService <object>{

    object Add(object T);
    List <object> GetAll();
    object Update(object T);
    void  Delete(Long id );
    object getOne(Long id);

    //void assignProduitToStock(Long idProduit, Long idStock);
}
