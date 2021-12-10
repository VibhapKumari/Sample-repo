package com.example.springBootPostgreSql.repository;

import com.example.springBootPostgreSql.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;



// JPA is an interface and Hibernate is the implementation. By default Spring uses Hibernate as the default JPA vendor.
public interface ProductRepository extends JpaRepository<Product, Integer> {


}
