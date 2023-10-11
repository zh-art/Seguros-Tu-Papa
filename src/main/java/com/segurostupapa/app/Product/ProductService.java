package com.segurostupapa.app.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    HashMap<String, Object> info;

    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository){
        this.productRepository = productRepository;
    }
    public List<Product> getProducts(){
        return this.productRepository.findAll();
    }

    public ResponseEntity<Object> newProduct(Product product) {

        Optional<Product> res = productRepository.findProductByName(product.getName());

        info = new HashMap<>();

        if(res.isPresent() && product.getId()==null){
            info.put("error", true);
            info.put("message", "Product exist!");
            return new ResponseEntity<>(
                    info,
                    HttpStatus.CONFLICT
            );
        }

        info.put("message", "Save success!");
        if(product.getId()!=null){
            info.put("message", "Update success!");
        }

        productRepository.save(product);
        info.put("data", product);
            return new ResponseEntity<>(
                    info,
                    HttpStatus.CREATED
        );
    }

    public ResponseEntity<Object> deleteProduct(Long id){

        info = new HashMap<>();

        boolean exists = this.productRepository.existsById(id);

        if(!exists){
            info.put("error", true);
            info.put("message", "No exists!");
            return new ResponseEntity<>(
                    info,
                    HttpStatus.CONFLICT
            );
        }
        productRepository.deleteById(id);
        info.put("message", "Delete success!");
        return new ResponseEntity<>(
                info,
                HttpStatus.ACCEPTED
        );
    }
}
