package com.example.gestionmagasinstock.Controllers;

import com.example.gestionmagasinstock.Entities.SecteurActivite;
import com.example.gestionmagasinstock.Services.IService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Secteur")
public class SecteurController {

    IService<SecteurActivite> iService;
    @PostMapping("/add")
    @ResponseBody
    public SecteurActivite Add(@RequestBody SecteurActivite secteurActivite) {
        return iService.Add(secteurActivite);
    }

    @PutMapping("/update")
    @ResponseBody
    public SecteurActivite Update(@RequestBody SecteurActivite secteurActivite) {
        return iService.Update(secteurActivite);
    }

    @GetMapping("/GetAll")
    @ResponseBody
    public List<SecteurActivite> GetAll() {
        return iService.GetAll();
    }

    @DeleteMapping("/delete/{id_del}")
    @ResponseBody
    public void Delete(@PathVariable("id_del") Long id) {
        iService.Delete(id);
    }

    @GetMapping("getDetail/{id_get}")
    @ResponseBody
    public SecteurActivite GetOne(@PathVariable("id_get") Long id) {
        return iService.getOne(id);
    }
}
