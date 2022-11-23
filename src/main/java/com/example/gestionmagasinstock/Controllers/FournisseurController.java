package com.example.gestionmagasinstock.Controllers;

import com.example.gestionmagasinstock.Entities.Facture;
import com.example.gestionmagasinstock.Entities.Fournisseur;
import com.example.gestionmagasinstock.Services.IService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Fournisseur")
public class FournisseurController {
    IService<Fournisseur> iService;

    @PostMapping("/addFournissuer")
    @ResponseBody
    public Fournisseur AddFournisseur(@RequestBody Fournisseur fournisseur) {
        return iService.Add(fournisseur);
    }

    @PutMapping("/updateFournisseur")
    @ResponseBody
    public Fournisseur UpdateFournisseur(@RequestBody Fournisseur fournisseur) {
        return iService.Update(fournisseur);
    }

    @GetMapping("/GetAll")
    @ResponseBody
    public List<Fournisseur> GetAllFournisseur() {
        return iService.GetAll();
    }

    @DeleteMapping("/delete/{id_del}")
    @ResponseBody
    public void DeleteFournisseur(@PathVariable("id_del") Long id) {
        iService.Delete(id);
    }

    @GetMapping("getDetailFournisseur/{id_get}")
    @ResponseBody
    public Fournisseur GetFournisseur(@PathVariable("id_get") Long id) {
        return iService.getOne(id);
    }
}

