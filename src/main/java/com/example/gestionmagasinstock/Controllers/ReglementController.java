package com.example.gestionmagasinstock.Controllers;

import com.example.gestionmagasinstock.Entities.Produit;
import com.example.gestionmagasinstock.Entities.Reglement;
import com.example.gestionmagasinstock.Services.IService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Reglement")
public class ReglementController {
    IService<Reglement> iService;

    @PostMapping("/add")
    @ResponseBody
    public Reglement Add(@RequestBody Reglement reglement) {
        return iService.Add(reglement);
    }

    @PutMapping("/update")
    @ResponseBody
    public Reglement Update(@RequestBody Reglement reglement) {
        return iService.Update(reglement);
    }

    @GetMapping("/GetAll")
    @ResponseBody
    public List<Reglement> GetAll() {
        return iService.GetAll();
    }

    @DeleteMapping("/delete/{id_del}")
    @ResponseBody
    public void Delete(@PathVariable("id_del") Long id) {
        iService.Delete(id);
    }

    @GetMapping("getDetail/{id_get}")
    @ResponseBody
    public Reglement GetOne(@PathVariable("id_get") Long id) {
        return iService.getOne(id);
    }
}
