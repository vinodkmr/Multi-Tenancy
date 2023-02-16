package dev.vinodkmr.controller;

import dev.vinodkmr.dao.product.ProductRepository;
import dev.vinodkmr.model.product.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author vinod.gangadhariah <br/>
 * created on 16-02-2023 <br/>
 */
@RestController
public class ProductController {

    @Autowired
    ProductRepository productRepository;

    @GetMapping("/products")
    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }
}
