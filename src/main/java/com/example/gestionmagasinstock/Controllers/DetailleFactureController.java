package com.example.gestionmagasinstock.Controllers;

import com.example.gestionmagasinstock.Entities.CategorieProduit;
import com.example.gestionmagasinstock.Entities.DetailFacture;
import com.example.gestionmagasinstock.Services.IService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@AllArgsConstructor
@RequestMapping("/DetailFacture")
public class DetailleFactureController {

    IService<DetailFacture> iService;

    @PostMapping("/addDetailFacture")
    @ResponseBody
    public DetailFacture AddDetailFacture(@RequestBody DetailFacture detailFacture) {
        return iService.Add(detailFacture);
    }

    @PutMapping("/updateDetailFacture")
    @ResponseBody
    public DetailFacture UpdateDetailFacture(@RequestBody DetailFacture detailFacture) {
        return iService.Update(detailFacture);
    }

    @GetMapping("/GetAllDetaille")
    @ResponseBody
    public List<DetailFacture> GetAllDetailFacture() {
        return iService.GetAll();
    }

    @DeleteMapping("/delete/{id_del}")
    @ResponseBody
    public void DeleteDetailFacture(@PathVariable("id_del") Long id) {
        iService.Delete(id);
    }

    @GetMapping("getDetailFacture/{id_get}")
    @ResponseBody
    public DetailFacture GetDetailFacture(@PathVariable("id_get") Long id) {
        return iService.getOne(id);
    }


}
