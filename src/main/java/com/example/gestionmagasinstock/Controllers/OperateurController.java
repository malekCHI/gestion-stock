package com.example.gestionmagasinstock.Controllers;

import com.example.gestionmagasinstock.Entities.Fournisseur;
import com.example.gestionmagasinstock.Entities.Operateur;
import com.example.gestionmagasinstock.Services.IOperateur;
import com.example.gestionmagasinstock.Services.IService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Operateur")
public class OperateurController {
    IService<Operateur> iService;
    IOperateur iOperateur;

    @PostMapping("/addOperateur")
    @ResponseBody
    public Operateur AddOperateur(@RequestBody Operateur operateur) {
        return iService.Add(operateur);
    }

    @PutMapping("/updateoperateur")
    @ResponseBody
    public Operateur Update(@RequestBody Operateur operateur) {
        return iService.Update(operateur);
    }

    @GetMapping("/GetAll")
    @ResponseBody
    public List<Operateur> GetAllOperateur() {
        return iService.GetAll();
    }

    @DeleteMapping("/delete/{id_del}")
    @ResponseBody
    public void DeleteOperateur(@PathVariable("id_del") Long id) {
        iService.Delete(id);
    }

    @GetMapping("getDetailoperateur/{id_get}")
    @ResponseBody
    public Operateur GetOperateur(@PathVariable("id_get") Long id) {
        return iService.getOne(id);
    }

    @PostMapping("assignOperateurToFacture/{idUniversite}/{idDepartement}")
    public void assignOperateurToFacture(@PathVariable Long idOperateur,@PathVariable Long idFacture){

        iOperateur.assignOperateurToFacture(idOperateur,idFacture);

    }
}
