import Dao.Impl.StoreDao;
import JavaBean.Store;
import org.junit.Test;

import java.util.List;

public class StoreDaoTest {
    StoreDao storeDao=new StoreDao();

    @Test//新增User测试
    public void testCreateUser(){
        Store store=new Store();
        store.setId(1L);
        store.setStoreName("天猫");
        store.setURL("www.tmall.com");

        storeDao.save(store);
    }

    @Test//修改User测试
    public void testUpdateUser(){
        Store store=new Store();
        store.setId(5L);
        store.setStoreName("京东");
        store.setURL("www.jd.com");

        storeDao.update(store);
    }

    @Test//删除User测试
    public void testDeleteUser(){
        storeDao.delete(1L);
    }

    @Test//查询User测试
    public void testGetUser(){
        Store s=storeDao.getOne(3L);
        System.out.println("StoreName:"+s.getStoreName());
        System.out.println("网址:"+s.getURL());
    }

    @Test//查询全部user测试
    public void testSelectAll(){
        List<Store> list=storeDao.getAll();
        list.forEach(item->System.out.println("StoreName:"+item.getStoreName()
                +"网址:"+item.getURL()));
    }
}
