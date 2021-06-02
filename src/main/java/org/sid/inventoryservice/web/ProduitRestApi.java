package org.sid.inventoryservice.web;

import org.sid.inventoryservice.dao.ProduitRepository;
import org.sid.inventoryservice.entities.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProduitRestApi {
    @Autowired
    private ProduitRepository produitRepository;

    @GetMapping(path = "/produits")
    public List<Produit> listProduit(){
        return produitRepository.findAll();
    }
    @GetMapping(path = "/produits/{id}")
    public Produit getProduit(@PathVariable(name="id") Long id){

        return produitRepository.findById(id).get();
    }
    @PostMapping(path = "/produits")
    public Produit save(@RequestBody Produit produit){
        return produitRepository.save(produit);
    }
    @PutMapping(path = "/produits/{id}")
    public Produit update(@RequestBody Produit produit,@PathVariable Long id){
        produit.setId(id);
        return produitRepository.save(produit);
    }
    @DeleteMapping(path = "/produits/{id}")
    public void delete(@PathVariable Long id){
        produitRepository.deleteById(id);
    }

}
