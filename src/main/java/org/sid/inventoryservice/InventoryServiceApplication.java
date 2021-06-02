package org.sid.inventoryservice;

import org.sid.inventoryservice.dao.ProduitRepository;
import org.sid.inventoryservice.entities.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class  InventoryServiceApplication implements CommandLineRunner {
    @Autowired
    private ProduitRepository produitRepository;
    public static void main(String[] args) {
        SpringApplication.run(InventoryServiceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        produitRepository.save(new Produit(null,"telephone",4500,3));
        produitRepository.save(new Produit(null,"imprimente",500,13));
        produitRepository.save(new Produit(null,"Pcs",15000,2));
        produitRepository.findAll().forEach(p->{
            System.out.println(p.getNom());
        });
    }
}
