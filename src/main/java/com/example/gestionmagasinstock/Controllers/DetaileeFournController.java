package com.example.gestionmagasinstock.Controllers;

import com.example.gestionmagasinstock.Entities.DetailFournisseur;
import com.example.gestionmagasinstock.Services.DetailleFournisseurService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/DetailFournisseur")
public class DetaileeFournController {

    DetailleFournisseurService detailleFournisseurService;

    @PostMapping("/adddetailFournisseur")
    @ResponseBody
    public DetailFournisseur AddDetailFournisseur(@RequestBody DetailFournisseur detailFournisseur) {
        return detailleFournisseurService.Add(detailFournisseur);
    }

    @PutMapping("/updatedetailFournisseur")
    @ResponseBody
    public DetailFournisseur UpdateDetailFournisseur(@RequestBody DetailFournisseur detailFournisseur) {
        return detailleFournisseurService.Update(detailFournisseur);
    }

    @GetMapping("/GetAllDetaille")
    @ResponseBody
    public List<DetailFournisseur> GetAllDetailFournisseur() {
        return detailleFournisseurService.GetAll();
    }

    @DeleteMapping("/delete/{id_del}")
    @ResponseBody
    public void DeleteDetailFournisseur(@PathVariable("id_del") Long id) {
        detailleFournisseurService.Delete(id);
    }

    @GetMapping("getDetailFournisseur/{id_get}")
    @ResponseBody
    public DetailFournisseur GetDetailFournisseur(@PathVariable("id_get") Long id) {
        return detailleFournisseurService.getOne(id);
    }
}
