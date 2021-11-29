package Dao.Impl;

import Dao.IUserDao;
import JavaBean.User;
import Util.JPA_Util;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

public class UserDao implements IUserDao {
    @Override
    public void save(User s) {
        EntityManager manager = JPA_Util.getEntityManager();
        manager.getTransaction().begin();
        manager.persist(s);
        manager.getTransaction().commit();
        manager.close();
    }

    @Override
    public void update(User s) {
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
        User s = manager.find(User.class, Id);
        manager.remove(s);
        manager.getTransaction().commit();
        manager.close();
    }

    @Override
    public User getOne(Long Id) {
        EntityManager manager = JPA_Util.getEntityManager();
        return manager.find(User.class, Id);
    }

    @Override
    public List<User> getAll() {
        EntityManager manager = JPA_Util.getEntityManager();
        String sql = "select u from User u";
        Query query = manager.createQuery(sql);
        List list = query.getResultList();
        manager.close();
        return list;
    }

    @Override
    public boolean Login(String username, String password) {
        EntityManager manager = JPA_Util.getEntityManager();
        String sql = "select u from User u where u.UserName=:username and User.Password=:password";
        Query query = manager.createQuery(sql);
        query.setParameter("username",username);
        query.setParameter("password",password);
        List list=query.getResultList();
        manager.close();
        return list.size()>=1;
    }
}
