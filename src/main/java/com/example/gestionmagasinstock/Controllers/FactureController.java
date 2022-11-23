package com.example.gestionmagasinstock.Controllers;

import com.example.gestionmagasinstock.Entities.DetailFacture;
import com.example.gestionmagasinstock.Entities.Facture;
import com.example.gestionmagasinstock.Services.FactureService;
import com.example.gestionmagasinstock.Services.IService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Facture")
public class FactureController {

    IService<Facture> iService;

    @PostMapping("/addfacture")
    @ResponseBody
    public Facture AddFacture(@RequestBody Facture facture) {
        return iService.Add(facture);
    }

    @PutMapping("/updateFacture")
    @ResponseBody
    public Facture UpdateFacture(@RequestBody Facture facture) {
        return iService.Update(facture);
    }

    @GetMapping("/GetAll")
    @ResponseBody
    public List<Facture> GetAllFacture() {
        return iService.GetAll();
    }

    @DeleteMapping("/delete/{id_del}")
    @ResponseBody
    public void DeleteFacture(@PathVariable("id_del") Long id) {
        iService.Delete(id);
    }

    @GetMapping("getDetailFacture/{id_get}")
    @ResponseBody
    public Facture GetFacture(@PathVariable("id_get") Long id) {
        return iService.getOne(id);
    }
}
