package com.example.appscraper.controller;

import com.example.appscraper.entitties.Products;
import com.example.appscraper.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductsController {
    @Autowired
    private ProductsService productsService;



    @GetMapping("/getall")
    public List<Products> getALlMapping() {

        return this.productsService.getAll();
    }


    //"proxy":"http://localhost:8080"
}

