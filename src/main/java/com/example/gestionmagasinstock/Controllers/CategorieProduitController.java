package com.example.gestionmagasinstock.Controllers;

import com.example.gestionmagasinstock.Entities.CategorieProduit;
import com.example.gestionmagasinstock.Services.IService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/CategorieProduit")
public class CategorieProduitController {
    IService <CategorieProduit> iService;

    @PostMapping("/addCategorieProduit")
    @ResponseBody
    public CategorieProduit AddCategorieProduit(@RequestBody CategorieProduit categorieProduit) {
        return iService.Add(categorieProduit);
    }

    @PutMapping("/updateCategorieProduit")
    @ResponseBody
    public CategorieProduit UpdateCategorieProduit(@RequestBody CategorieProduit categorieProduit) {
        return iService.Update(categorieProduit);
    }

    @GetMapping("/GetAllCat")
    @ResponseBody
    public List<CategorieProduit> GetAllCategorieProduit() {
        return iService.GetAll();
    }

    @DeleteMapping("/delete/{id_del}")
    @ResponseBody
    public void DeleteCategorieProduit(@PathVariable("id_del") Long id) {
        iService.Delete(id);
    }

    @GetMapping("getCategorieProduit/{id_test}")
    @ResponseBody
    public CategorieProduit GetCategorieProduit(@PathVariable("id_test") Long id) {
        return iService.getOne(id);
    }

}
