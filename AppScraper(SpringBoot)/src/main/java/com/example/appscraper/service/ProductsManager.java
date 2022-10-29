package com.example.appscraper.service;

import com.example.appscraper.entitties.Products;
import com.example.appscraper.reposite.ProductsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProductsManager implements ProductsService {


    @Autowired
    private ProductsRepo productsRepo;

    @Override
    public List<Products> getAll() {

        return  this.productsRepo.findAll();




    }






}
