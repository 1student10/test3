package Dao.Impl;


import Dao.IProductDao;
import JavaBean.Product;
import Util.JPA_Util;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

public class ProductDao implements IProductDao {
    @Override
    public void save(Product s) {
        EntityManager manager = JPA_Util.getEntityManager();
        manager.getTransaction().begin();
        manager.persist(s);
        manager.getTransaction().commit();
        manager.close();
    }

    @Override
    public void update(Product s) {
        EntityManager manager = JPA_Util.getEntityManager();
        manager.getTransaction().begin();
        manager.merge(s);
        manager.getTransaction().commit();
        manager.close();
    }

    @Override
    public void delete(Long Id) {
        EntityManager manager = JPA_Util.getEntityManager();
        manager.getTransaction().begin();
        Product s = manager.find(Product.class, Id);
        manager.remove(s);
        manager.getTransaction().commit();
        manager.close();
    }

    @Override
    public Product getOne(Long Id) {
        EntityManager manager = JPA_Util.getEntityManager();
        return manager.find(Product.class, Id);
    }

    @Override
    public List<Product> getAll() {
        EntityManager manager = JPA_Util.getEntityManager();
        String sql = "select p from Product p";
        Query query = manager.createQuery(sql);
        List list = query.getResultList();
        manager.close();
        return list;
    }
}
