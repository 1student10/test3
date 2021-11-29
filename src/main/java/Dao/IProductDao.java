package Dao;

import JavaBean.Product;

import java.util.List;

public interface IProductDao {
    void save(Product s);
    void update(Product s);
    void delete(Long Id);
    Product getOne(Long Id);
    List<Product> getAll();
}
