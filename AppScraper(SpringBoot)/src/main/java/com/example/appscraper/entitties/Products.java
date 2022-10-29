package com.example.appscraper.entitties;


import lombok.Data;
import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.*;


@Data
@Entity
@Table(name = "products")

public class Products {

    @Id
    @Column(name = "productid")
    private int id;


    @Column(name = "productsname")
    private String productsName;


    @Column(name = "productsprice")
    private  String productsPrice;

    @Column(name = "productslink")
    private  String productLink;







}
