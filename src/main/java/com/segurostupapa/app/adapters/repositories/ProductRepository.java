package com.segurostupapa.app.adapters.repositories;

import com.segurostupapa.app.domain.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository

public interface ProductRepository extends JpaRepository<Product, Long> {

    //@Query("SELECT * FROM Product WHERE product.name = ?1")
    Optional<Product> findProductByName(String name);
}
