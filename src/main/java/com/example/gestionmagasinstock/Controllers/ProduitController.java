package com.example.gestionmagasinstock.Controllers;

import com.example.gestionmagasinstock.Entities.Produit;
import com.example.gestionmagasinstock.Services.IService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Produit")
public class ProduitController {
    IService<Produit> iService;

    @PostMapping("/addProduit")
    @ResponseBody
    public Produit AddProduit(@RequestBody Produit produit) {
        return iService.Add(produit);
    }

    @PutMapping("/updateProduit")
    @ResponseBody
    public Produit Update(@RequestBody Produit produit) {
        return iService.Update(produit);
    }

    @GetMapping("/GetAll")
    @ResponseBody
    public List<Produit> GetAllProduit() {
        return iService.GetAll();
    }

    @DeleteMapping("/delete/{id_del}")
    @ResponseBody
    public void DeleteProduit(@PathVariable("id_del") Long id) {
        iService.Delete(id);
    }

    @GetMapping("getDetailProduit/{id_get}")
    @ResponseBody
    public Produit GetProduit(@PathVariable("id_get") Long id) {
        return iService.getOne(id);
    }
}

