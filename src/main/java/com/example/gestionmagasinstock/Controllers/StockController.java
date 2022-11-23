package com.example.gestionmagasinstock.Controllers;

import com.example.gestionmagasinstock.Entities.SecteurActivite;
import com.example.gestionmagasinstock.Entities.Stock;
import com.example.gestionmagasinstock.Services.IService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Stock")
public class StockController {

    IService<Stock> iService;
    @PostMapping("/add")
    @ResponseBody
    public Stock Add(@RequestBody Stock stock) {
        return iService.Add(stock);
    }

    @PutMapping("/update")
    @ResponseBody
    public Stock Update(@RequestBody Stock stock ){
        return iService.Update(stock);
    }

    @GetMapping("/GetAll")
    @ResponseBody
    public List<Stock> GetAll() {
        return iService.GetAll();
    }

    @DeleteMapping("/delete/{id_del}")
    @ResponseBody
    public void Delete(@PathVariable("id_del") Long id) {
        iService.Delete(id);
    }

    @GetMapping("getDetail/{id_get}")
    @ResponseBody
    public Stock GetOne(@PathVariable("id_get") Long id) {
        return iService.getOne(id);
    }
}
