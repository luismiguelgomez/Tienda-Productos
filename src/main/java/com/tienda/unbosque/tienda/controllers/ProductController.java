package com.tienda.unbosque.tienda.controllers;

import com.tienda.unbosque.tienda.models.Product;
import com.tienda.unbosque.tienda.services.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("product")
public class ProductController {

    @Autowired
    ProductServices productServices;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Product> getAll(){
        return productServices.getAll();
    }

}
