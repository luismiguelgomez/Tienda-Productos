package com.tienda.unbosque.tienda.services;

import com.tienda.unbosque.tienda.dao.ProductDao;
import com.tienda.unbosque.tienda.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServices {
    @Autowired
    ProductDao productDao;

    public List<Product> getAll(){
        return productDao.getAll();
    }

}
