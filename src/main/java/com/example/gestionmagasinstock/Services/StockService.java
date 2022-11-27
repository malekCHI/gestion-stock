package com.example.gestionmagasinstock.Services;

import com.example.gestionmagasinstock.Entities.Stock;
import com.example.gestionmagasinstock.Repository.StockRepo;
import lombok.AllArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class StockService implements IService<Stock>,IStock{
    StockRepo stockRepo;
    @Override
    public Stock Add(Stock T) {
        return stockRepo.save(T);
    }

    @Override
    public List<Stock> GetAll() {
        return (List<Stock>) stockRepo.findAll();
    }

    @Override
    public Stock Update(Stock T) {
        return stockRepo.save(T);
    }

    @Override
    public void Delete(Long id) {
        stockRepo.deleteById(id);
    }

    @Override
    public Stock getOne(Long id) {
        return stockRepo.findById(id).orElse(null);
    }

@Scheduled(cron="*/10 * * * * *")
    public void retrieveStatusStock() {
        List<Stock> stocks= (List<Stock>) stockRepo.findAll();
        for (Stock stock:stocks){
            if (stock.getAteMin()>stock.getQte())
                System.out.println(stock);
        }
    }
}
