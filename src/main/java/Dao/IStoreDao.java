package Dao;

import JavaBean.Store;

import java.util.List;

public interface IStoreDao {
    void save(Store s);
    void update(Store s);
    void delete(Long Id);
    Store getOne(Long Id);
    List<Store> getAll();
}
