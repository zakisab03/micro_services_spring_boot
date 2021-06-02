package org.sid.inventoryservice.dao;

import org.sid.inventoryservice.entities.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepository extends JpaRepository<Produit,Long> {
}
