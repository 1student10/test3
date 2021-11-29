import Dao.Impl.ProductDao;
import JavaBean.Product;
import JavaBean.User;
import org.junit.Test;

import java.util.List;

public class ProductDaoTest {
    ProductDao productdao=new ProductDao();

    @Test//新增Product测试
    public void testCreateUser(){
        Product product=new Product();
        product.setId(1l);
        product.setName("饼干");
        product.setPrice(9.5);

        productdao.save(product);
    }

    @Test//修改Product测试
    public void testUpdateProduct(){
        Product product=new Product();
        product.setId(1l);
        product.setName("饼干");
        product.setPrice(9.5);

        productdao.update(product);
    }

    @Test//删除Product测试
    public void testDeleteProduct(){
        productdao.delete(1L);
    }

    @Test//查询Product测试
    public void testGetProduct(){
        Product s=productdao.getOne(3L);
        System.out.println("Name:"+s.getName());
        System.out.println("Price:"+s.getPrice());
    }

    @Test//查询全部Product测试
    public void testSelectAll(){
        List<Product> list=productdao.getAll();
        list.forEach(item->System.out.println("Name:"+item.getName()
                +",Price:"+item.getPrice()));
    }
}
