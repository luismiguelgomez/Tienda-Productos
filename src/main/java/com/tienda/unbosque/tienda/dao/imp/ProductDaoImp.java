package com.tienda.unbosque.tienda.dao.imp;

import com.tienda.unbosque.tienda.dao.ProductDao;
import com.tienda.unbosque.tienda.models.Product;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Transactional
@Repository
public class ProductDaoImp implements ProductDao {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    @Transactional
    public List<Product> getAll() {
        String hqlObtenerTodosUsuarios = "FROM Product as p";
        return (List<Product>) entityManager.createQuery(hqlObtenerTodosUsuarios).getResultList();
    }
}
