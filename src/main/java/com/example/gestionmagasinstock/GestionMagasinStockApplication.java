package com.example.gestionmagasinstock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class GestionMagasinStockApplication {

    public static void main(String[] args) {
        SpringApplication.run(GestionMagasinStockApplication.class, args);
    }

}
