package com.eficens.main.controller;


import com.eficens.main.model.ProductModel;
import com.eficens.main.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ControllerProduct {

    @Autowired
    ProductRepository productinterface;


    @GetMapping("/getproduct")
    public List<ProductModel> getproduct(){
        return productinterface.findAll();
    }
}
