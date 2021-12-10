package com.example.springBootPostgreSql.service;

import com.example.springBootPostgreSql.model.Product;
import com.example.springBootPostgreSql.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Product addProduct(Product product){
        return  productRepository.save(product);
    }

    public List<Product> getProducts(){
        return productRepository.findAll();
    }
}
