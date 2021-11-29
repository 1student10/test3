package Dao.Impl;

import Dao.IStoreDao;
import JavaBean.Store;
import Util.JPA_Util;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

public class StoreDao implements IStoreDao {
    @Override
    public void save(Store s) {
        EntityManager manager = JPA_Util.getEntityManager();
        manager.getTransaction().begin();
        manager.persist(s);
        manager.getTransaction().commit();
        manager.close();
    }

    @Override
    public void update(Store s) {
        EntityManager manager = JPA_Util.getEntityManager();
        manager.getTransaction().begin();
        manager.persist(s);
        manager.getTransaction().commit();
        manager.close();
    }

    @Override
    public void delete(Long Id) {
        EntityManager manager = JPA_Util.getEntityManager();
        manager.getTransaction().begin();
        Store s = manager.find(Store.class, Id);
        manager.remove(s);
        manager.getTransaction().commit();
        manager.close();
    }

    @Override
    public Store getOne(Long Id) {
        EntityManager manager = JPA_Util.getEntityManager();
        return manager.find(Store.class, Id);
    }

    @Override
    public List<Store> getAll() {
        EntityManager manager = JPA_Util.getEntityManager();
        String sql = "select s from Store s";
        Query query = manager.createQuery(sql);
        List list = query.getResultList();
        manager.close();
        return list;
    }
}
