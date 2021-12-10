package com.example.springBootPostgreSql.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Setter
@Getter
@NoArgsConstructor
@Data
@AllArgsConstructor
@Table(name = "PRODUCT_TBL")
public class Product {

    @Id
    @GeneratedValue
    @Column(name="Prod_Id")
    private int id;

    @Column(name="Prod_Name")
    private String name;

    @Column(name="Prod_Price")
    private double price;

    @Column(name="Prod_Quantity")
    private int quantity;

}
