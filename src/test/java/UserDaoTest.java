import Dao.Impl.UserDao;
import JavaBean.User;
import org.junit.*;

import java.util.List;

public class UserDaoTest {
    UserDao udao=new UserDao();

    @Test//新增User测试
    public void testCreateUser(){
        User user=new User();
        user.setId(2L);
        user.setPassword("123456");
        user.setAge(18);
        user.setSex(true);
        user.setUserName("小明");
        user.setHeight(180.0);

        udao.save(user);
    }
    @Test//修改User测试
    public void testUpdateUser(){
        User user=new User();
        user.setId(5L);
        user.setPassword("1234567");
        user.setAge(19);
        user.setSex(true);
        user.setUserName("stu");
        user.setHeight(170.0);

        udao.update(user);
    }
    @Test//删除User测试
    public void testDeleteUser(){
        udao.delete(1L);
    }
    @Test//查询User测试
    public void testGetUser(){
        User u=udao.getOne(3L);
        System.out.println("Name:"+u.getUserName());
        System.out.println("Age:"+u.getAge());
        System.out.println("Sex:"+u.getSex());
        System.out.println("Height:"+u.getHeight());
    }
    @Test//查询全部user测试
    public void testSelectAll(){
        List<User> list=udao.getAll();
        list.forEach(item->System.out.println("Name:"+item.getUserName()
                +",Age:"+item.getAge()
                +",Sex:"+item.getSex()
                +",Height:"+item.getHeight()));
    }
    @Test
    public void testLogin(){
        System.out.println();
    }
    @Test
    public void A(){
        System.out.println("京东");
        System.out.println("天猫");
    }
}
