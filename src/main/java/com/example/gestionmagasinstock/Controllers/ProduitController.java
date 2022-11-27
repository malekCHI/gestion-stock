package com.example.gestionmagasinstock.Controllers;

import com.example.gestionmagasinstock.Entities.Produit;
import com.example.gestionmagasinstock.Services.IProduit;
import com.example.gestionmagasinstock.Services.IService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Produit")
public class ProduitController {
    IService<Produit> iService;
    IProduit iProduit;

    @PostMapping("/addProduit")
    @ResponseBody
    public Produit AddProduit(@RequestBody Produit p, Long idCategorieProduit, Long idStock) {
        return iProduit.addProduit( p,  idCategorieProduit, idStock);
    }

    @PutMapping("/updateProduit")
    @ResponseBody
    public Produit Update(@RequestBody Produit p, Long idCategorieProduit, Long idStock) {
        return iProduit.updateProduit(p,idCategorieProduit,idStock);
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

    @PostMapping("/assignProduitToStock/{idProduit}/{idStock}")
    void assignProduitToStock (@PathVariable Long idProduit,@PathVariable Long idStock){
        iProduit.assignProduitToStock(idProduit,idStock);
    }
}

