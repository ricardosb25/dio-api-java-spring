package com.rsbprojects.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rsbprojects.entities.MyStore;
import com.rsbprojects.entities.Product;

@RestController
@RequestMapping (value = "/products")
public class ProductController {

    @GetMapping
    public List<Product> getObjects(){
        MyStore store1 = new MyStore(1L,"Games");
        MyStore store2 = new MyStore(2L, "Books");
        Product product1 = new Product(1, "Forza Horizon 5", 200, store1);
        Product product2 = new Product(2, "Batman Arkham Knight", 100, store1);
        Product product3 = new Product(3, "SpiderMan 2", 350, store1);
        Product product4 = new Product(4, "Pequeno Principe", 50, store2);
        Product product5 = new Product(5, "Turma da monica", 10, store2);

        List<Product> list = Arrays.asList(product1,product2,product3,product4,product5);

        return list;
    }
    
}
